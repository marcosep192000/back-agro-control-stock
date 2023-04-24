package com.agro.admin.models.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProviderResponse {
	private Long id;
	@NotBlank(message = " i can't be empty ")
	private String nameProvider;
	@NotBlank(message = " i can't be empty ")
	private Integer cuit;
	private String address;
	private String state;
	private String country;
	private Integer Telephone;
	private String web;
	private String mail;

}
