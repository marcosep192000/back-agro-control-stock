package com.agro.admin.service.impl;

import com.agro.admin.models.entity.Category;
import com.agro.admin.models.entity.Product;
import com.agro.admin.models.mappers.ProductMapper;
import com.agro.admin.models.request.ProductRequest;
import com.agro.admin.models.response.ProductResponse;
import com.agro.admin.repository.CategoryRepository;
import com.agro.admin.repository.ProductRepository;
import com.agro.admin.security.util.Mensaje;
import com.agro.admin.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {
	@Autowired
	ProductMapper mapper;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public ResponseEntity<Product> create(ProductRequest request, Long id) {
		Optional<Product> product = productRepository.findByNameProduct(request.getNameProduct());
		Category category = categoryRepository.findById(id).orElseThrow();
		Product product1;
		if (product.isEmpty()) {
			product1 = mapper.productRequestToProduc(request, category);
			productRepository.save(product1);
			category.getProduct().add(product1);
			return new ResponseEntity(new Mensaje("product created successfully!"), HttpStatus.CREATED);
		}
		return new ResponseEntity(new Mensaje("product could not be loaded"), HttpStatus.BAD_REQUEST);
	}
//------------------------------------------- create ok  --------------------------------------------------------

	@Override
	public ResponseEntity<Product> updateProduct(ProductRequest productRequest,Long id) {
		Optional<Product> optionalProduct = productRepository.findById(id);
		Product product = optionalProduct.orElseThrow(()-> new RuntimeException("Product Not Exist"));
		product= mapper.updateProduct(productRequest,product);
		productRepository.save(product);
		return new ResponseEntity(new Mensaje("Update Product"),HttpStatus.ACCEPTED);
	}

	//------------------------------------------- update state ok   --------------------------------------------------------
	@Override
	public ResponseEntity<ProductResponse> softDelete(long id) {
		Optional<Product> product = productRepository.findById(id);
		if (product.isEmpty()) {
			new RuntimeException("not EXIST ID");
		}
			productRepository.deleteById(id);
			return new ResponseEntity(new Mensaje("deleted"), HttpStatus.ACCEPTED);

	}

	//------------------------------------------- softDelete state corregir por nuevo soft delete  --------------------------------------------------------
	@Override
	public ResponseEntity<List<ProductResponse>> allProduct() {
	 List<Product> products = productRepository.findAll();
	 List<ProductResponse>productList = new ArrayList<>();
	 products.forEach(product -> {
		 ProductResponse response = mapper.productToProductResponse(product);
		 productList.add(response);
	 });
		return new ResponseEntity(productList ,HttpStatus.ACCEPTED);
	}
	//------------------------------------------- allproduct ok  --------------------------------------------------------


	@Override
	public ProductResponse findByName(String name) {
		Optional<Product>  optionalProduct= productRepository.findByNameProduct(name);
		Product product = optionalProduct.orElseThrow(()-> new RuntimeException(" Product not exist"));
		ProductResponse productResponse = mapper.productToProductResponse(product);
	    return productResponse;
	}
}
//------------------------------------------- allproduct ok  --------------------------------------------------------
