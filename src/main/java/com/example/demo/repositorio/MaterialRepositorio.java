package com.example.demo.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dominio.Material;

public interface MaterialRepositorio extends CrudRepository<Material, Integer> {

}
