package com.agro.admin.service;

import com.agro.admin.models.entity.Marca;
import com.agro.admin.models.entity.Provider;
import com.agro.admin.models.request.MarcaRequest;
import com.agro.admin.models.response.MarcaResponse;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface IMarcaService {

    public ResponseEntity<List<Marca>> getAll() ;

    public Marca getById(Long id) ;
    public ResponseEntity<MarcaResponse> create(MarcaRequest marcaRequest);

    public ResponseEntity<?> update(MarcaRequest request,Long id);


    public ResponseEntity<?> delete(Long id) ;
}
