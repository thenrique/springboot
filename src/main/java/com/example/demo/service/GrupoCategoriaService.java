package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dominio.GrupoCategoria;
import com.example.demo.repositorio.GrupoCategoriaRepositorio;

@Component
public class GrupoCategoriaService {

	@Autowired
   private GrupoCategoriaRepositorio grupoCategoriaRepositorio;
	
	
	public void salvar(GrupoCategoria grupo) {
		grupoCategoriaRepositorio.save(grupo);
	}
	
	public List<GrupoCategoria> findAll(){
		return (List<GrupoCategoria>) grupoCategoriaRepositorio.findAll();
	}
	
	public GrupoCategoria findById(Integer id) {
		return grupoCategoriaRepositorio.findOne(id);
	}

	public void remover(Integer id) {
		grupoCategoriaRepositorio.delete(id);
		
	}
	
	
}
