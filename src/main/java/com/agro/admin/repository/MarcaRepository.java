package com.agro.admin.repository;

import com.agro.admin.models.entity.Marca;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;
@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
    @NonNull
    Optional<Marca> findByNameMarca(String nameMarca);

}