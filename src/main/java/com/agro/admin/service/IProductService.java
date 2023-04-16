package com.agro.admin.service;

import com.agro.admin.models.entity.Product;
import com.agro.admin.models.request.ProductRequest;
import com.agro.admin.models.response.ProductResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IProductService {

	ResponseEntity<Product> createProduct(ProductRequest request);
	ResponseEntity<Product> create(ProductRequest request,Long id );
	Product updateProduct( Long id) ;
	ProductResponse softDelete (Long id ,boolean state);
	ResponseEntity<List<ProductResponse>> allProduct();
	ProductResponse findByName(String name);
}
