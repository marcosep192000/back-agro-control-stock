package com.agro.admin.repository;

import com.agro.admin.models.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
	boolean existsByName(String name);

}