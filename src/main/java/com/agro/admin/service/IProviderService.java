package com.agro.admin.service;

import com.agro.admin.models.entity.Provider;

import java.util.List;
import java.util.Optional;

public interface IProviderService {
    public List<Provider> getAll() ;
    public Optional<Provider> getById(Long id) ;
    public Provider create( Provider Provider);
    public Provider update(Provider Provider);
    public void delete(Long id) ;
}
