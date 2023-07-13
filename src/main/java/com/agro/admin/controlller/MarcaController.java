package com.agro.admin.controlller;

import com.agro.admin.models.request.MarcaRequest;
import com.agro.admin.models.response.MarcaResponse;
import com.agro.admin.service.impl.MarcaServiceImpl;
import com.agro.admin.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/v1/api/marca")
public class MarcaController {
	@Autowired
	MarcaServiceImpl marcaService ;
	@PostMapping("/create")
	public ResponseEntity<?> saveProduct(@RequestBody @Validated  MarcaRequest marcaRequest) {
		 marcaService.create(marcaRequest);
		 return  ResponseEntity.ok().body(new Message("Marca Created!"));
	}

	@GetMapping("/all")
	public ResponseEntity<List<MarcaResponse>> saveProduct( ) {
		List<MarcaResponse> response =   marcaService.getAll();
		return  ResponseEntity.ok().body(response);
	}

	@PutMapping("update/{id}")
    public ResponseEntity<?> update(@Valid @RequestBody MarcaRequest request,@PathVariable Long id){
		     marcaService.update(request,id);
			 return ResponseEntity.ok().body(new Message("Update Marca!"));
	}
	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> update(@PathVariable Long id){
		marcaService.delete(id);
		return ResponseEntity.ok(new Message("Deleted Marca!"));
	}
}
