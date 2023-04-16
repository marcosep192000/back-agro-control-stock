package com.agro.admin.controlller;

import com.agro.admin.models.entity.Category;
import com.agro.admin.models.entity.Product;
import com.agro.admin.models.request.CategoryRequest;
import com.agro.admin.repository.CategoryRepository;
import com.agro.admin.service.impl.CategoryServiceImpl;
import com.agro.admin.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	CategoryServiceImpl categoryService;
	@Autowired
	ProductServiceImpl productService;
	@Autowired
	private CategoryRepository categoryRepository;

	@PostMapping("/create")
	public ResponseEntity<?> createCategory(@RequestBody CategoryRequest categoryRequest) {
		ResponseEntity response = categoryService.createCategory(categoryRequest);
		return new ResponseEntity<>(response.getBody(), response.getStatusCode());
	}

	@GetMapping("/find-with-category/{id}")
	public ResponseEntity<Product> findWhiteCategory(@RequestBody @PathVariable Long id) {
	ResponseEntity response =  categoryService.categoryByid(id);
		return new ResponseEntity(response.getBody(),response.getStatusCode());
	}

	@GetMapping("/findAll")
	public ResponseEntity<List<Category>>findAll() {
		return new ResponseEntity(categoryRepository.findAll(), HttpStatus.ACCEPTED);
	}



}