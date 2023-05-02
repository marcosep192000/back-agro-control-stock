package com.agro.admin.controlller;

import com.agro.admin.models.entity.Marca;
import com.agro.admin.models.entity.Marca;
import com.agro.admin.models.request.MarcaRequest;
import com.agro.admin.models.response.MarcaResponse;
import com.agro.admin.repository.MarcaRepository;
import com.agro.admin.repository.MarcaRepository;
import com.agro.admin.service.impl.MarcaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.ColumnResult;
import javax.validation.Valid;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/marca")
public class MarcaController {
    @Autowired
    MarcaServiceImpl service;
    @Autowired
    private MarcaRepository marcaRepository;

    @PostMapping("/create")
    public ResponseEntity<?> create(@Valid @RequestBody MarcaRequest request) {
        ResponseEntity<?> response = service.create(request);
        return new ResponseEntity(response.getBody(), response.getStatusCode());
    }
    @DeleteMapping("/delete/{id}")
            public ResponseEntity<?> delete( @PathVariable Long id ){
        ResponseEntity response = service.delete(id);
        return new  ResponseEntity(response.getBody(),response.getStatusCode());
        }
    @PutMapping("update/{id}")
    public ResponseEntity<?> update(@Valid @RequestBody MarcaRequest request , @PathVariable Long id ){
        ResponseEntity response = service.update(request,id);
        return  ResponseEntity
                .status(response.getStatusCode())
                .body(response.getBody());
    }

    @GetMapping("/all")
    public ResponseEntity<List<Marca>> all(){


        return  null;

    }


    }
