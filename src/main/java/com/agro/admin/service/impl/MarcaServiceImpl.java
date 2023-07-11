package com.agro.admin.service.impl;

import com.agro.admin.models.entity.Marca;
import com.agro.admin.models.entity.Provider;
import com.agro.admin.models.mappers.MarcaMapper;
import com.agro.admin.models.request.MarcaRequest;
import com.agro.admin.models.response.MarcaResponse;
import com.agro.admin.repository.MarcaRepository;
import com.agro.admin.service.IMarcaService;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class MarcaServiceImpl implements IMarcaService {

    @Autowired
  MarcaMapper  marcaMapper;
    @Autowired
    MarcaRepository repository;
    @Override
    public List<MarcaResponse> getAll() {
        return  repository.findAll()
                .stream()
                .map(marca -> marcaMapper.entityToDto(marca))
                .collect(Collectors.toList());
    }





    @Override
    public Optional<Marca> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public void  create(MarcaRequest request) {
        boolean existMarca = repository.existsByName(request.getName());

        if (existMarca){
             throw new RuntimeException("dsadad");
        }else {
            Marca marca = marcaMapper.dtoToEntity(request);
            repository.save(marca);
        }

    }
    @Override
    public Marca update(MarcaRequest request , Long id)
    {
        Marca marca = repository.findById(id).orElseThrow(()-> new RuntimeException(" You can't update!"));
          Marca marca1 =  marcaMapper.Update(request,marca);
        repository.save(marca1);
        return marca1;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
