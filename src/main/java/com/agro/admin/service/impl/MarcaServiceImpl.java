package com.agro.admin.service.impl;

import com.agro.admin.models.entity.Marca;
import com.agro.admin.models.mappers.MarcaMapper;
import com.agro.admin.models.request.MarcaRequest;
import com.agro.admin.models.response.MarcaResponse;
import com.agro.admin.repository.MarcaRepository;
import com.agro.admin.security.util.Mensaje;
import com.agro.admin.service.IMarcaService;
import org.hibernate.Filter;
import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@Service
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
    @Transactional
    @Override
    public ResponseEntity<MarcaResponse> create(MarcaRequest marcaRequest) {
        Optional<Marca> marcaFind = marcaRepository.findByNameMarca(marcaRequest.getNameMarca());

        if (marcaFind.isEmpty()) {
            Marca marca =new Marca();
            marca.setNameMarca(marcaRequest.getNameMarca());
            marcaRepository.save(marca);
            return new ResponseEntity(new Mensaje("create"), HttpStatus.CREATED);
        } else throw new RuntimeException("error");
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
    public List<Marca> all() {
        return null;
    }
    @Override
    public ResponseEntity<?> delete(Long id) {
            marcaRepository.deleteById(id);
            return new ResponseEntity<>(new Mensaje("delete"), HttpStatus.ACCEPTED);
        }

    }



