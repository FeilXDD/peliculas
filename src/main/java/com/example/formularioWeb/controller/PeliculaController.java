package com.example.formularioWeb.controller;

import com.example.formularioWeb.model.Pelicula;
import com.example.formularioWeb.repository.PeliculaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/*
* recibe todas las interaciones con el front
* */
@RestController
public class PeliculaController {

    /*
    * se crea una instancia de PeliculaRepository
    * */
    PeliculaRepository repository;

    /*
    * se inyecta la dependencia
    * */
    public PeliculaController(PeliculaRepository repository) {
        this.repository = repository;
    }

    /*
    * aqui se crea una pelicula
    * */
    @GetMapping("/api/crearPelicula")
    public void crearPeliculas(){
        Pelicula pelicula1 = new Pelicula("Titanic", "JamesCameron", "drama");
        Pelicula pelicula2 = new Pelicula("starWards", "Lucas", "cienciaAccion");

        /*
        * se usa repository para guardar la pelicula
        * */
        repository.save(pelicula1);
        repository.save(pelicula2);

    }

    /*
    * me devuelve una lista de peliculas
    * http://127.0.0.1:8080/api/peliculas
    * */
    @GetMapping("/api/peliculas")
    public List<Pelicula> obtenerPelicula(){
        return repository.findAll();
    }

    /*
    * me muestra una sola pelicula con el id
    * */
    @GetMapping("/api/pelicula/{id}")
    public ResponseEntity<Pelicula> obtenerPelicula(@PathVariable Long id){
        Optional<Pelicula> opt = repository.findById(id);

        /*
        * si es verdadero me devuelve un respose entity si no me devuelve el envolvente
        * */
        if(opt.isEmpty()){
            return ResponseEntity.badRequest().build();
        }
        else{
            return ResponseEntity.ok(opt.get());
        }

    }
}
