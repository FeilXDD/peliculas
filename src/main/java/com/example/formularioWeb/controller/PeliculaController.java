package com.example.formularioWeb.controller;

import com.example.formularioWeb.model.Pelicula;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* recibe todas las interaciones con el front
* */
@RestController
public class PeliculaController {

    /*
    * aqui se crea una pelicula
    * */
    @GetMapping("/api/crearPelicula")
    public void crearPeliculas(){
        Pelicula pelicula1 = new Pelicula("Titanic", "JamesCameron", "drama");
        Pelicula pelicula2 = new Pelicula("starWards", "Lucas", "cienciaAccion");
    }
}
