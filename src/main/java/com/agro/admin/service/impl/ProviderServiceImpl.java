package com.agro.admin.service.impl;

import com.agro.admin.models.entity.Provider;
import com.agro.admin.models.mappers.ProviderMapper;
import com.agro.admin.models.request.ProviderRequest;
import com.agro.admin.models.response.ProviderResponse;
import com.agro.admin.repository.ProviderRepository;
import com.agro.admin.security.util.Mensaje;
import com.agro.admin.service.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class ProviderServiceImpl implements IProviderService {
	@Autowired
	ProviderRepository providerRepository;
	@Autowired
	ProviderMapper mapper;
	@Override
	public ResponseEntity<List<ProviderResponse>> findAll() {
		List<Provider> provider = providerRepository.findAll();
		List<ProviderResponse> newList = new ArrayList<>();
		provider.forEach(provider1 -> {
			ProviderResponse response = mapper.dtoToEntity(provider1);
			newList.add(response);
		});
		return new ResponseEntity<>(newList, HttpStatus.CREATED);
	}
	@Override
	public Optional<Provider> getById(Long id) {
		return Optional.empty();
	}
	@Transactional
	@Override
	public ResponseEntity<Provider> create(ProviderRequest providerRequest) {
		boolean provider = providerRepository.existsByCuit(providerRequest.getCuit());
		if (!provider) {
			Provider provider1 = mapper.entityToDto(providerRequest);
			providerRepository.save(provider1);
			return new ResponseEntity(new Mensaje("Create"), HttpStatus.CREATED);
		} else {
			return new ResponseEntity(new Mensaje("cuit exist"), HttpStatus.BAD_REQUEST);
		}
	}
	@Transactional
	@Override
	public Provider update(Provider Provider) {
		return null;
	}
	@Transactional
	@Override
	public ResponseEntity delete(Long id) {
		Provider provider = providerRepository.findById(id).orElseThrow(() -> new RuntimeException("Id Not Exist or has been deleted"));
		if (provider.isStatus()) {
			provider.setStatus(false);
			return new ResponseEntity(new Mensaje("Deleted"), HttpStatus.ACCEPTED);
		} else {
			throw new RuntimeException("This provider has been deleted before");
		}
	}
}
