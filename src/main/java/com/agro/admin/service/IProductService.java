package com.agro.admin.service;

import com.agro.admin.models.entity.Product;
import com.agro.admin.models.request.ProductRequest;
import com.agro.admin.models.response.ProductResponse;

import java.util.List;

public interface IProductService {

	Product createProduct(ProductRequest request);
	Product updateProduct( Long id) ;
	ProductResponse softDelete (Long id ,boolean state);
	List<ProductResponse> allProduct();
	ProductResponse findByName(String name);
}
