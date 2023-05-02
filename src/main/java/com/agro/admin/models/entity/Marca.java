package com.agro.admin.models.entity;

import lombok.*;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SQLDelete(sql = "UPDATE marca SET status = true WHERE id=?")
@Where(clause = "status=false")
//@FilterDef(name = "deletedMarcaFilter",parameters = @ParamDef(name = "isDeleted", type = "boolean"))
//@Filter(name = "deletedMarcaFilter",condition = "deleted = :isDeleted")

@Entity
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank(message = "empty")
    private String nameMarca;
    private boolean status  = Boolean.FALSE;
}
