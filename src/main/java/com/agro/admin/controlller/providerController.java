package com.agro.admin.controlller;

import com.agro.admin.models.entity.Provider;
import com.agro.admin.models.request.ProviderRequest;
import com.agro.admin.service.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/provider")
public class providerController {
	@Autowired
	IProviderService providerService;
	@PostMapping("/create")
	public ResponseEntity<Provider> create(@Valid @RequestBody ProviderRequest providerRequest) {
		ResponseEntity<Provider> response = providerService.create(providerRequest);
		return new ResponseEntity(response.getBody(), response.getStatusCode());
	}
	@GetMapping("/all")
	public ResponseEntity<?> findProduct() {
		ResponseEntity entity = providerService.findAll();
		return new ResponseEntity(entity.getBody(), entity.getStatusCode());
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
		ResponseEntity response = providerService.delete(id);
		return new ResponseEntity(response.getBody(), response.getStatusCode());
	}

}
