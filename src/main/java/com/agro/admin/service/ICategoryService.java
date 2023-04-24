package com.agro.admin.service;

import com.agro.admin.models.entity.Product;
import com.agro.admin.models.request.CategoryRequest;
import com.agro.admin.models.request.ProductRequest;
import com.agro.admin.models.response.ProductResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ICategoryService {
	ResponseEntity<?> createCategory(CategoryRequest categoryRequest);
    ResponseEntity categoryByid(Long id );
	ResponseEntity<ProductResponse> softDelete(long id);
	ResponseEntity<Product> updateProduct(ProductRequest productRequest,Long id);
	ResponseEntity<List<ProductResponse>> allProduct();

}
