package com.agro.admin.models.mappers;

import com.agro.admin.models.entity.Category;
import com.agro.admin.models.entity.Product;
import com.agro.admin.models.request.ProductRequest;
import com.agro.admin.models.response.ProductResponse;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProductMapper {

	public Product productRequestToProduct(ProductRequest request){
		Product product = new Product();
		product.setDescriptionProduct(request.getDescriptionProduct());
		product.setIva(request.getIva());
		product.setNameProduct(request.getNameProduct());
		product.setPriceDls(request.getPriceDls());
		return  product;
	}
	public Product productRequestToProduc(ProductRequest request, Category category){
		Product product = new Product();
		product.setDescriptionProduct(request.getDescriptionProduct());
		product.setIva(request.getIva());
		product.setNameProduct(request.getNameProduct());
		product.setPriceDls(request.getPriceDls());
		product.setCategory(category);
		return  product;
	}
	public ProductResponse productToProductResponse (Product product){
		ProductResponse response = new ProductResponse() ;
		response.setId(product.getId());
	response.setDescriptionProduct(product.getDescriptionProduct());
		response.setIva(product.getIva());
		response.setNameProduct(product.getNameProduct());
		response.setPriceDls(product.getPriceDls());
		response.setUpdateDate(product.getUpdateDate());
		return response ;
	}
}


