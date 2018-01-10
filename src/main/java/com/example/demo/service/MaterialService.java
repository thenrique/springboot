package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dominio.Material;
import com.example.demo.repositorio.MaterialRepositorio;

@Component
public class MaterialService {

	@Autowired
	private MaterialRepositorio materialRepositorio;
	
	public Material salvar(Material material) {
		materialRepositorio.save(material);
		return material;
	}
	
	public List<Material> buscarTodos(){
		return (List<Material>) materialRepositorio.findAll();
	}
	
	public void remover(Integer id) {
		materialRepositorio.delete(id);
	}
	public Material buscarPeloID(Integer id) {
		return materialRepositorio.findOne(id);
	}
}
