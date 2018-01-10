package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dominio.GrupoCategoria;

public interface GrupoCategoriaRepositorio extends JpaRepository<GrupoCategoria, Integer>  {

}
