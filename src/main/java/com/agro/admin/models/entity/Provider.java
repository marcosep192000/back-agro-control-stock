package com.agro.admin.models.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "provider")
public class Provider {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", nullable = false)
	private Long id;
    private String name;
    private int cuit;
    private String address;
    private String phone;
    private String contact;
    private String mail;
    private boolean state = true;
}