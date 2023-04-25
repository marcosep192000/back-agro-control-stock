package com.agro.admin.models.request;

import lombok.*;

import javax.validation.constraints.NotBlank;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProviderRequest {
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
