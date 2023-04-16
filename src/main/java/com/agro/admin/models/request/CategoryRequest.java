package com.agro.admin.models.request;

import com.agro.admin.models.entity.Category;
import com.agro.admin.models.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
 @NoArgsConstructor
@AllArgsConstructor
public class CategoryRequest {
	private String nameCategory ;
	private String descriptionCategory;
	private List<Product> product = new ArrayList<>();

}
