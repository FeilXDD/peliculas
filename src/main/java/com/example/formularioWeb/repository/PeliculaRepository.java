package com.example.formularioWeb.repository;

import com.example.formularioWeb.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* se crea un repositorio
* */
@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
}
