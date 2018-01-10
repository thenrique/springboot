package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dominio.GrupoCategoria;
import com.example.demo.service.GrupoCategoriaService;

@Controller
public class GrupoCategoriaController {

	@Autowired
	private GrupoCategoriaService service;
	
	@GetMapping("/grupoCategoria/listar")
	public ModelAndView listar() {
		ModelAndView md = new ModelAndView("/grupoCategoria/listar");
		md.addObject("grupoCategoria",service.findAll());
		return md;
	}
	@GetMapping("/grupoCategoria/nova")
	public ModelAndView novo(GrupoCategoria grupo) {
		ModelAndView mv = new ModelAndView();
        mv.addObject("grupoCategoria", grupo	);
         
        return mv;
	}
	
	@PostMapping("/grupoCategoria/salvar")
    public ModelAndView salvar(GrupoCategoria grupo) {
         
		service.salvar(grupo);
         
        return listar();
    }
	
	@GetMapping("/grupoCategoria/editar/{id}")
    public ModelAndView edit( @PathVariable("id") Integer id) {
         
        return novo(service.findById(id));
    }
     
    @GetMapping("/grupoCategoria/remover/{id}")
    public ModelAndView delete(@PathVariable("id") Integer id) {
         
    	service.remover(id);
         
        return listar();
    }
}
