package com.agro.admin.models.mappers;

import com.agro.admin.models.entity.Category;
import com.agro.admin.models.request.CategoryRequest;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
	public Category categoryRequestToCategory(CategoryRequest categoryRequest){
	    Category category = new Category();
	    category.setNameCategory(categoryRequest.getNameCategory());
	    category.setDescriptionCategory(categoryRequest.getDescriptionCategory());
	    return category;

	}

}
