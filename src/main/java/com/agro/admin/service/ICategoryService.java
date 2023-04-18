package com.agro.admin.service;

import com.agro.admin.models.request.CategoryRequest;
import org.springframework.http.ResponseEntity;

public interface ICategoryService {
	ResponseEntity<?> createCategory(CategoryRequest categoryRequest);
    ResponseEntity categoryByid (Long id );
}
