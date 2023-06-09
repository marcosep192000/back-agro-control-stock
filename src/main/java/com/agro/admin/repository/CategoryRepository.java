package com.agro.admin.repository;

import com.agro.admin.models.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	@Override
	Optional<Category> findById(Long aLong);
}