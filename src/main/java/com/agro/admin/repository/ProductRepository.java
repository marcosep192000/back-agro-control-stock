package com.agro.admin.repository;

import com.agro.admin.models.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
	Optional<Product> findByNameProduct(String nameProduct);

	List<Product> findByCategory_Id(Long id);


}