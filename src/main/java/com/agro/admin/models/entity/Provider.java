package com.agro.admin.models.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.awt.*;

@Entity
@Table(name = "provider")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank(message = " i can't be empty ")
    private String nameProvider ;
    @NotBlank(message = " i can't be empty ")
    private  Integer cuit ;

    private String address ;

    private String state ;
    private String country;
    private Integer Telephone ;
    private String web ;
    private String mail;
    @NotBlank(message = " i can't be empty ")
    private boolean status = true;


}