package com.agro.admin.service;

import com.agro.admin.models.entity.Marca;
import com.agro.admin.models.entity.Provider;

import java.util.List;
import java.util.Optional;

public interface IMarcaService {

    public List<Marca> getAllUsers() ;

    public Optional<Marca> getUserById(Long id) ;
    public Marca createUser( Marca marca);

    public Marca updateUser(Marca marca);

    public void deleteUser(Long id) ;
}
