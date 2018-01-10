package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dominio.Categoria;
import com.example.demo.repositorio.CategoriaRepositorio;

@Component
public class CategoriaService  {

	@Autowired
	private CategoriaRepositorio categoriaRepositorio;
	
	
	public Categoria salvar(Categoria categoria) {
		categoriaRepositorio.save(categoria);
		return categoria;
	}
	@RequestMapping("all")
	public List<Categoria> buscarTodos(){
		return categoriaRepositorio.findAll();
	}
	@GetMapping("/")
	public String hello() {
		return "Helloo";
	}
	
	
	public void remover(Integer id) {
		 categoriaRepositorio.delete(id);
	}
	public Categoria buscarPeloID(Integer id) {
		return categoriaRepositorio.findOne(id);
	}
}
