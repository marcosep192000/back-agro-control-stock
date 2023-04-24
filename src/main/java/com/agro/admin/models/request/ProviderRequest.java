package com.agro.admin.models.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProviderRequest {
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
