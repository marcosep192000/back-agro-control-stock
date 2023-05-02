package com.agro.admin.models.entity;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "product")
@SQLDelete(sql = "UPDATE product SET state = true WHERE id = ? ")
@Where(clause = "state=false")
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
	private float stock;//ver o agregar stock por almacen
	private String format;
	private boolean state = Boolean.FALSE;
	@UpdateTimestamp
	@Column(name = "updated_on_date")
	private LocalDateTime updateDate;

	@ManyToOne
	Category category;

}