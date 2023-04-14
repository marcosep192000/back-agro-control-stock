package com.agro.admin.models.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
 @NoArgsConstructor
@AllArgsConstructor
public class CategoryRequest {
	private String nameCategory ;
	private String descriptionCategory;
}
