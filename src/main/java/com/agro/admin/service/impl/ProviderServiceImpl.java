package com.agro.admin.service.impl;

import com.agro.admin.models.entity.Provider;
import com.agro.admin.service.IProviderService;

import java.util.List;
import java.util.Optional;

public class ProviderServiceImpl implements IProviderService {

    @Override
    public List<Provider> getAllUsers() {
        return null;
    }

    @Override
    public Optional<Provider> getUserById(Long id) {
        return Optional.empty();
    }

    @Override
    public Provider createUser(Provider Provider) {
        return null;
    }

    @Override
    public Provider updateUser(Provider Provider) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
