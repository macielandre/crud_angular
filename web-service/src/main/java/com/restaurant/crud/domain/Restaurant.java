package com.restaurant.crud.domain;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.Date;

@Data //Getters, setters, constructor...
@Entity //Diz que essa classe vai representar um objeto no banco
@Table(name="crud.restaurant")
public class Restaurant{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Insere depois do ultimo id
    private Integer id;
    @Column(name="name")//Nome correspondente a tabela do banco
    private String name;
    @Column(name="cnpj")
    private String cnpj;
    @Column(name="rating")
    private String rating;
    @Column(name="register_date")
    private Date register_date;
}