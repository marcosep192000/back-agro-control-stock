package com.agro.admin.service.impl;

import com.agro.admin.models.entity.Marca;
import com.agro.admin.models.mappers.MarcaMapper;
import com.agro.admin.models.request.MarcaRequest;
import com.agro.admin.models.response.MarcaResponse;
import com.agro.admin.repository.MarcaRepository;
import com.agro.admin.security.util.Mensaje;
import com.agro.admin.service.IMarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class MarcaServiceImpl implements IMarcaService {
    @Autowired
    MarcaRepository marcaRepository;
    @Autowired
    MarcaMapper marcaMapper;

    @Override
    public ResponseEntity<List<Marca>> getAll() {
        return null;
    }

    @Override
    public Marca getById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<MarcaResponse> create(MarcaRequest marcaRequest) {
        Marca marcaFind = marcaRepository.findByNameMarca(marcaRequest.getNameMarca()).orElseThrow(() -> new RuntimeException("Not found"));
        if (marcaFind.getNameMarca() != "" || marcaFind.getNameMarca() != null) {
            marcaFind.setNameMarca(marcaRequest.getNameMarca());
            return new ResponseEntity(new Mensaje(""), HttpStatus.CREATED);
        } else throw new RuntimeException("");
    }

    @Override
    public ResponseEntity<?> update(MarcaRequest request, Long id) {
        Marca marca = marcaRepository.findById(id).orElseThrow(() -> new RuntimeException("NOT FOUND,MARCA NOT EXIST"));
        if (marca.isStatus()) {
            marca.setNameMarca(request.getNameMarca());
            return new ResponseEntity(new Mensaje("MARCA UPDATE"), HttpStatus.ACCEPTED);
        }
        return new ResponseEntity(new Mensaje("NOT FOUND"), HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<?> delete(Long id) {
        Marca marca = marcaRepository.findById(id).orElseThrow(() -> new RuntimeException("Marca not exist"));
        if (marca.isStatus()) {
            marca.setStatus(false);
            return new ResponseEntity<>(new Mensaje("deleted"), HttpStatus.ACCEPTED);
        } else marca.setStatus(true);
        return new ResponseEntity<>(new Mensaje("modify"), HttpStatus.CONTINUE);
    }
}
