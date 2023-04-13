package com.agro.admin.service.impl;

import com.agro.admin.models.entity.Product;
import com.agro.admin.models.mappers.ProductMapper;
import com.agro.admin.models.request.ProductRequest;
import com.agro.admin.models.response.ProductResponse;
import com.agro.admin.repository.ProductRepository;
import com.agro.admin.security.util.Mensaje;
import com.agro.admin.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	ProductMapper mapper;
	@Autowired
	ProductRepository productRepository;
	@Override
	public ResponseEntity<Product> createProduct(ProductRequest request) {
		Optional<Product> product= productRepository.findByNameProduct(request.getNameProduct());
Product product1;
	if (product.isEmpty()){
		 product1 = mapper.productRequestToProduct(request);
		productRepository.save(product1);
		return new ResponseEntity(new Mensaje("create product"), HttpStatus.CREATED);
	}
		return new ResponseEntity(new Mensaje("not create error! "),HttpStatus.BAD_REQUEST);
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
