package com.agro.admin.models.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	@NotBlank (message = "name is not empty!")
	private  String nameProduct;
	private String descriptionProduct;
	private float  priceDls ;
	private  float iva;
	private boolean state = true;
	@UpdateTimestamp
	@Column(name = "updated_on_date")
	private LocalDateTime updateDate;



}