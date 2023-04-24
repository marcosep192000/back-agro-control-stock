package com.agro.admin.service.impl;

import com.agro.admin.models.entity.Provider;
import com.agro.admin.service.IProviderService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Service
public class ProviderServiceImpl implements IProviderService {
	@Override
	public List<Provider> getAll() {
		return null;
	}

	@Override
	public Optional<Provider> getById(Long id) {
		return Optional.empty();
	}

	@Override
	public Provider create(Provider Provider) {


		return null;
	}

	@Override
	public Provider update(Provider Provider) {
		return null;
	}

	@Override
	public void delete(Long id) {
	}
}
