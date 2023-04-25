package com.agro.admin.service.impl;

import com.agro.admin.models.entity.Provider;
import com.agro.admin.models.mappers.ProviderMapper;
import com.agro.admin.models.request.ProviderRequest;
import com.agro.admin.repository.ProviderRepository;
import com.agro.admin.security.util.Mensaje;
import com.agro.admin.service.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpRange;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
@Service
public class ProviderServiceImpl implements IProviderService {

	@Autowired
	ProviderRepository providerRepository;
	@Autowired
	ProviderMapper mapper;

	@Override
	public List<Provider> getAll() {
		return null;
	}

	@Override
	public Optional<Provider> getById(Long id) {return Optional.empty();
	}

	@Transactional
	@Override
	public ResponseEntity<Provider> create(ProviderRequest providerRequest) {
	boolean provider = providerRepository.existsByCuit(providerRequest.getCuit());
		if (!provider) {
			Provider provider1 = mapper.entityToDto(providerRequest);
			providerRepository.save(provider1);
			return new ResponseEntity(new Mensaje("Create"), HttpStatus.CREATED);
		}else {
			return new ResponseEntity(new Mensaje("cuit exist"), HttpStatus.BAD_REQUEST);
	}
	}

	@Override
	public Provider update(Provider Provider) {
		return null;
	}

	@Override
	public void delete(Long id) {
	}
}
