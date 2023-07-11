package com.agro.admin.controlller;

import com.agro.admin.models.entity.Product;
import com.agro.admin.models.request.ProductRequest;
import com.agro.admin.repository.CategoryRepository;
import com.agro.admin.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Optional;
@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductServiceImpl productService;
	@Autowired
	private CategoryRepository categoryRepository;

	@PostMapping("/create-product")
	public ResponseEntity<Void> saveProduct(@RequestBody @Validated ProductRequest productRequest ) {
		ResponseEntity<?> responseEntity=productService.create(productRequest);
		return new ResponseEntity(responseEntity.getBody(),responseEntity.getStatusCode());
	}

	@PostMapping("/update-product/{idCategory}")
	public ResponseEntity<Void> updateProduct(@RequestBody @Validated ProductRequest productRequest ,@PathVariable Long idCategory) {
		ResponseEntity<?> responseEntity=productService.create(productRequest);
		return new ResponseEntity(responseEntity.getBody(),responseEntity.getStatusCode());
	}

	@GetMapping("/all-product")
	public ResponseEntity<Void> findProduct() {
		ResponseEntity<?> responseEntity= (ResponseEntity<?>) productService.allProduct();
		return new ResponseEntity(responseEntity.getBody(),responseEntity.getStatusCode());
	}

	@PostMapping("/delete-product/{idCategory}")
	public ResponseEntity<Void> deleteProduct(@RequestBody @Validated ProductRequest productRequest ,@PathVariable Long idCategory) {
		ResponseEntity<?> responseEntity=productService.create(productRequest);
		return new ResponseEntity(responseEntity.getBody(),responseEntity.getStatusCode());
	}
  }

