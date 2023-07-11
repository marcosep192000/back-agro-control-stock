package com.agro.admin.models.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
	@NotBlank(message = "name is not empty!")
	private String nameProduct;
	private String descriptionProduct;
	private float  priceDls ;
	private float iva;
	private boolean state = true;
	private long id_category;
	@UpdateTimestamp
	@Column(name = "updated_on_date")
	private LocalDateTime updateDate;



}
