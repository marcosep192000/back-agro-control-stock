package com.agro.admin.controlller;

import com.agro.admin.models.request.ProductRequest;
import com.agro.admin.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductServiceImpl productService;
	@PostMapping("/create-product")
	public ResponseEntity<Void> save(@RequestBody @Validated ProductRequest productRequest) {
	   ResponseEntity<?> responseEntity=productService.createProduct(productRequest);
		return new ResponseEntity(responseEntity.getBody(),responseEntity.getStatusCode());
	}

//	@GetMapping("/{id}")
//	public ResponseEntity<ProductDto> findById(@PathVariable("id") Long id) {
//		ProductDto product = productService.findById(id);
//		return ResponseEntity.ok(product);
//	}
//
//	@DeleteMapping("/{id}")
//	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
//		Optional.ofNullable(productService.findById(id)).orElseThrow(() -> {
//			log.error("Unable to delete non-existent data！");
//			return new ResourceNotFoundException();
//		});
//		productService.deleteById(id);
//		return ResponseEntity.ok().build();
//	}
//
//	@PutMapping("/{id}")
//	public ResponseEntity<Void> update(@RequestBody @Validated ProductDto productDto, @PathVariable("id") Long id) {
//		productService.update(productDto, id);
//		return ResponseEntity.ok().build();
//	}
}