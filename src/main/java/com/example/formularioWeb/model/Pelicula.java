package com.example.formularioWeb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
/*
* constructor , getter, setter, constructor vacio han sido creados
* */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
/*
* reconoce que es una entidad
* */
@Entity
public class Pelicula {
    /*
    * reconoce que es un id y genera automaticamente el valor
    * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String director;
    String genero;

}
