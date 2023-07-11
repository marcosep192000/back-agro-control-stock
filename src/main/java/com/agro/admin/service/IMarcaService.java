package com.agro.admin.service;

import com.agro.admin.models.entity.Marca;
import com.agro.admin.models.entity.Provider;
import com.agro.admin.models.request.MarcaRequest;
import com.agro.admin.models.response.MarcaResponse;

import java.util.List;
import java.util.Optional;

public interface IMarcaService {

    public List<MarcaResponse> getAll();
    public Optional<Marca> getById(Long id) ;
    public void  create(MarcaRequest request);

    public Marca update(MarcaRequest request , Long id);


    public void delete(Long id) ;
}
