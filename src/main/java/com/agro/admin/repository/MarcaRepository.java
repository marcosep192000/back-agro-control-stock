package com.agro.admin.repository;

import com.agro.admin.models.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
    Optional<Marca> findByNameMarca(String nameMarca);
    boolean existsByNameMarca(String nameMarca);
    @Query("select (count(m) > 0) from Marca m where upper(m.nameMarca) = upper(:nameMarca)")
    boolean exist(@Param("nameMarca") String nameMarca);
}