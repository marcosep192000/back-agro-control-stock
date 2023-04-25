package com.agro.admin.models.response;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProviderResponse {
	private Long id;
	@NotBlank(message = " i can't be empty ")
	private String nameProvider;
	private Integer cuit;
	private String address;
	private String state;
	private String country;
	private Integer telephone;
	private String web;
	private String mail;

}
