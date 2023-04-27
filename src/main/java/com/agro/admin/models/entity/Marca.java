package com.agro.admin.models.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank(message = "empty")
    private String nameMarca;
    private boolean status ;

}
