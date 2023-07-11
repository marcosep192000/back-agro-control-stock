package com.agro.admin.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	private String nameCategory ;
	private String descriptionCategory;


	@OneToMany(fetch = FetchType.EAGER, mappedBy = "category")
	@JsonIgnoreProperties("category")
	List<Product> product =new ArrayList<>();

}