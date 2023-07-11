package com.agro.admin.models.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProviderRequest {
	private Long id;
	private String name;
	private int cuit;
	private String address;
	private String phone;
	private String contact;
	private String mail;
	private boolean state = true;
}
