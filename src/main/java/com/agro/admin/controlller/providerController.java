package com.agro.admin.controlller;

import com.agro.admin.models.entity.Provider;
import com.agro.admin.models.request.ProductRequest;
import com.agro.admin.models.request.ProviderRequest;
import com.agro.admin.models.response.ProductResponse;
import com.agro.admin.models.response.ProviderResponse;
import com.agro.admin.service.IProviderService;
import org.apache.coyote.Response;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/provider")
public class providerController {

	 @Autowired
	IProviderService providerService ;

	 @PostMapping("/create")
	public ResponseEntity<Provider> create(@Valid  @RequestBody  ProviderRequest providerRequest ) {
          ResponseEntity<Provider> response = providerService.create(providerRequest);
		  return new ResponseEntity(response.getBody(),response.getStatusCode());
	}
//	@PutMapping("/update-product/{idCategory}")
//	public ResponseEntity<Void> updateProduct(@RequestBody @Validated ProviderRequest providerRequest , @PathVariable Long id) {
//
//		return new ResponseEntity(responseEntity.getBody(),responseEntity.getStatusCode());
//	}
	@GetMapping("/all")
	public ResponseEntity<?> findProduct() {
		ResponseEntity entity=  providerService.findAll();
		return new ResponseEntity(entity.getBody(),entity.getStatusCode());
	}



	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
		  	ResponseEntity response = providerService.delete(id);
		return new ResponseEntity(response.getBody(),response.getStatusCode());
	}
//	// no actualiza el estate controlar a false
//	@GetMapping("/find-product/{name}")
//	public ResponseEntity<?> findNameProduct(@PathVariable String name) {
//
//		return new ResponseEntity(response, HttpStatus.OK);
//
//	}
}
