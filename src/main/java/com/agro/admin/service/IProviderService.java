package com.agro.admin.service;

import com.agro.admin.models.entity.Provider;

import java.util.List;
import java.util.Optional;

public interface IProviderService {


    public List<Provider> getAllUsers() ;

    public Optional<Provider> getUserById(Long id) ;
    public Provider createUser( Provider Provider);

    public Provider updateUser(Provider Provider);

    public void deleteUser(Long id) ;
}
