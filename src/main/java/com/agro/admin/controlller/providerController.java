package com.agro.admin.controlller;

import com.agro.admin.models.request.ProductRequest;
import com.agro.admin.models.request.ProviderRequest;
import com.agro.admin.models.response.ProductResponse;
import com.agro.admin.service.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

public class providerController {

	 @Autowired
	IProviderService providerService ;

//	 @PostMapping("/create-product/{idCategory}")
//	public ResponseEntity<Void> saveProduct(@RequestBody @Validated ProductRequest productRequest , @PathVariable Long id) {
//
//		return new ResponseEntity(responseEntity.getBody(),responseEntity.getStatusCode());
//	}
//	@PutMapping("/update-product/{idCategory}")
//	public ResponseEntity<Void> updateProduct(@RequestBody @Validated ProviderRequest providerRequest , @PathVariable Long id) {
//
//		return new ResponseEntity(responseEntity.getBody(),responseEntity.getStatusCode());
//	}
//	@GetMapping("/all-product")
//	public ResponseEntity<Void> findProduct() {
//
//
//		return new ResponseEntity(responseEntity.getBody(),responseEntity.getStatusCode());
//	}
//	@DeleteMapping("/delete-product/{idCategory}")
//	public ResponseEntity<?> deleteProduct(@PathVariable Long idCategory) {
//
//		return new ResponseEntity(response.getBody(),response.getStatusCode());
//	}
//	// no actualiza el estate controlar a false
//	@GetMapping("/find-product/{name}")
//	public ResponseEntity<?> findNameProduct(@PathVariable String name) {
//
//		return new ResponseEntity(response, HttpStatus.OK);
//
//	}
}
