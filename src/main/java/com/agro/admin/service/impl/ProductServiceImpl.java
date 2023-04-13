package com.agro.admin.service.impl;

import com.agro.admin.models.entity.Product;
import com.agro.admin.models.request.ProductRequest;
import com.agro.admin.models.response.ProductResponse;
import com.agro.admin.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
	@Override
	public Product createProduct(ProductRequest request) {
		return null;
	}
	@Override
	public Product updateProduct(Long id) {
		return null;
	}
	@Override
	public ProductResponse softDelete(Long id, boolean state) {
		return null;
	}
	@Override
	public List<ProductResponse> allProduct() {
		return null;
	}
	@Override
	public ProductResponse findByName(String name) {
		return null;
	}
}
