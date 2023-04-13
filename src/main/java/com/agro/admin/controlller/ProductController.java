package com.agro.admin.controlller;

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

//	@PostMapping
//	public ResponseEntity<Void> save(@RequestBody @Validated ProductDto productDto) {
//		productService.save(productDto);
//		return ResponseEntity.ok().build();
//	}
//
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