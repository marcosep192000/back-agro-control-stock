package com.agro.admin.models.mappers;
import java.time.LocalDateTime;

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
		response.setState(product.isState());
		return response ;
	}

	public  Product ProductSoftDelete(Product pro, boolean  state ){
		 pro.setState(state);
		 return pro;
	}
	public Product updateProduct(ProductRequest productRequest, Product product){
	    product.setNameProduct(productRequest.getNameProduct());
	    product.setDescriptionProduct(productRequest.getDescriptionProduct());
	    product.setPriceDls(productRequest.getPriceDls());
	    product.setIva(productRequest.getIva());
	    product.setState(productRequest.isState());
	    product.setUpdateDate(productRequest.getUpdateDate());
	    return product;



	}


}


