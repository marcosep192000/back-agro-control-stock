package com.agro.admin.models.response;

import com.agro.admin.models.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResponse {

	private Long id;

	private String nameCategory ;

	private String descriptionCategory;

	private List<Product> product = new ArrayList<>();

}
