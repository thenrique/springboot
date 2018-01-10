package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dominio.Categoria;
import com.example.demo.service.CategoriaService;
import com.example.demo.service.GrupoCategoriaService;

@Controller
public class CategoriaController {

	
	@Autowired
	private CategoriaService categoriaService;
	
	@Autowired
	private GrupoCategoriaService grupoCategoriaService;
	
	@RequestMapping("/listar")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("/listar");
		modelAndView.addObject("categorias",categoriaService.buscarTodos());
		return modelAndView;
	}
	
	@GetMapping("/nova")
	public ModelAndView novo(Categoria categoria) {
		ModelAndView mv = new ModelAndView("/nova");
        mv.addObject("categoria", categoria	);
        mv.addObject("gruposCategoria",grupoCategoriaService.findAll());
         
        return mv;
	}
	
	@PostMapping("/salvar")
    public ModelAndView salvar(Categoria categoria) {
         
		categoriaService.salvar(categoria);
         
        return listar();
    }
	
	@GetMapping("/editar/{id}")
    public ModelAndView edit( @PathVariable("id") Integer id) {
         
        return novo(categoriaService.buscarPeloID(id));
    }
     
    @GetMapping("/remover/{id}")
    public ModelAndView delete(@PathVariable("id") Integer id) {
         
        categoriaService.remover(id);
         
        return listar();
    }
}