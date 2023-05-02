package com.agro.admin.models.request;

import lombok.*;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MarcaRequest {
    @NotBlank(message = "empty")
    private String nameMarca;
    private boolean status ;
}
