package com.agro.admin.service.impl;

import com.agro.admin.models.entity.Category;
import com.agro.admin.models.entity.Product;
import com.agro.admin.models.mappers.CategoryMapper;
import com.agro.admin.models.request.CategoryRequest;
import com.agro.admin.models.request.ProductRequest;
import com.agro.admin.models.response.ProductResponse;
import com.agro.admin.repository.CategoryRepository;
import com.agro.admin.repository.ProductRepository;
import com.agro.admin.security.util.Mensaje;
import com.agro.admin.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements ICategoryService {
	@Autowired
	CategoryRepository categoryRepository ;
	@Autowired
	CategoryMapper mapper;
	@Autowired
	private ProductRepository productRepository;

	@Override
	@Transactional
	public ResponseEntity<?> createCategory(CategoryRequest categoryRequest) {
		Category entity = mapper.categoryRequestToCategory(categoryRequest);
		 categoryRepository.save(entity);
		 System.out.println(entity);
		return  new ResponseEntity(new Mensaje("Category Create"), HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity categoryByid(Long id) {
		categoryRepository.findById(id);
		List<Product> products = productRepository.findByCategory_Id(id);
		
		return new ResponseEntity(products,HttpStatus.ACCEPTED);
	}
	@Transactional
	@Override
	public ResponseEntity<ProductResponse> softDelete(long id) {
		Optional<Category>  optionalCategory = categoryRepository.findById(id);
		Category category = optionalCategory.orElseThrow(()-> new Error("Not found"));
		categoryRepository.delete(category);
		return new ResponseEntity(new Mensaje("Delet Category"), HttpStatus.ACCEPTED);
	}
	@Override
	public ResponseEntity<Product> updateProduct(ProductRequest productRequest, Long id) {
		Optional<Category>  optionalCategory = categoryRepository.findById(id);
		Category category = optionalCategory.orElseThrow(()-> new Error("Not found"));

		return null;
	}
	@Override
	public ResponseEntity<List<ProductResponse>> allProduct() {
		return null;
	}
}
