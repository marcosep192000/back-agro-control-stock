package com.agro.admin.service;

import com.agro.admin.models.entity.Marca;
import com.agro.admin.models.entity.Provider;
import com.agro.admin.models.request.MarcaRequest;
import com.agro.admin.models.response.MarcaResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface IMarcaService {

    public ResponseEntity<List<Marca>> getAll() ;

    public Marca getById(Long id) ;
    public ResponseEntity<MarcaResponse> create(MarcaRequest marcaRequest);

    public void update(Marca marca);

    public void delete(Long id) ;
}
