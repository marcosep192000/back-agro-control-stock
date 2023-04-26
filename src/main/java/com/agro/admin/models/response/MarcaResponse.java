package com.agro.admin.models.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MarcaResponse {
    private Long id;
    private String nameMarca;
    private String status ;
}
