package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.dominio.Categoria;

@Component
public interface CategoriaRepositorio extends JpaRepository<Categoria, Integer> {

	
}
