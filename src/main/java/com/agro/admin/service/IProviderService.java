package com.agro.admin.service;

import com.agro.admin.models.entity.Provider;
import com.agro.admin.models.request.ProviderRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface IProviderService {
    public List<Provider> getAll() ;
    public Optional<Provider> getById(Long id) ;
    public ResponseEntity<Provider> create(ProviderRequest providerRequest);
    public Provider update(Provider Provider);
    public void delete(Long id) ;
}
