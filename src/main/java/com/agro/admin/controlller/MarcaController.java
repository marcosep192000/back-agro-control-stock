package com.agro.admin.controlller;

import com.agro.admin.models.entity.Marca;
import com.agro.admin.models.entity.Provider;
import com.agro.admin.models.request.MarcaRequest;
import com.agro.admin.models.request.ProviderRequest;
import com.agro.admin.repository.MarcaRepository;
import com.agro.admin.service.impl.MarcaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public class MarcaController {
    @Autowired
    MarcaServiceImpl service;
    @PostMapping("/create")
    public ResponseEntity<?> create(@Valid @RequestBody MarcaRequest request){
        ResponseEntity<?> response =  service.create(request);
        return new ResponseEntity(response.getBody(),response.getStatusCode());
    }
}
