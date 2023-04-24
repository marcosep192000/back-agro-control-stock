package com.agro.admin.models.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
	@Column(name = "id", nullable = false)
	private Long id;
	@NotBlank(message = "name is not empty!")
	private  String nameProduct;
	private String descriptionProduct;
	private float  priceDls ;
	private  float iva;
	private boolean state;
	@UpdateTimestamp
	@Column(name = "updated_on_date")
	private LocalDateTime updateDate;


}
