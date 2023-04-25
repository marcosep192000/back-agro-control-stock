package com.agro.admin.repository;

import com.agro.admin.models.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {
	boolean existsByCuit(Integer cuit);



}