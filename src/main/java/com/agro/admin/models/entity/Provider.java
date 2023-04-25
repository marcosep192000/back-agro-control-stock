package com.agro.admin.models.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.awt.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "provider")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank(message = " i can't be empty ")
    private String nameProvider;
    private Integer cuit;
    private String address;
    private String state;
    private String country;
    private Integer Telephone;
    private String web;
    private String mail;
    private boolean status = true;
}
