package com.restaurant.crud.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data //Getters, setters, constructor...
@Entity //Diz que essa classe vai representar um objeto no banco

@Table(name="restaurant")
public class Restaurant{
    @Column(name="name")//Nome correspondente a tabela do banco
    private String name;
    @Id //chave que não repete no banco
    @Column(name="cnpj")
    private Float cnpj;
    @Column(name="rating")
    private String rating;
    @Column(name="register_date")
    private Date register_date;
}