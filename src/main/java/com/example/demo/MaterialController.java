package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dominio.Material;
import com.example.demo.service.CategoriaService;
import com.example.demo.service.MaterialService;

@Component
@RequestMapping()
public class MaterialController {
	
	
	@Autowired
	private MaterialService materialService;
	
	@Autowired
	private CategoriaService categoriaService;

	@RequestMapping("/material/listar")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("/material/listar");
		modelAndView.addObject("materiais",materialService.buscarTodos());
		return modelAndView;
	}
	
	@RequestMapping("/material/nova")
	public ModelAndView novo(Material material) {
		ModelAndView mv = new ModelAndView("/material/nova");
        mv.addObject("material", material	);
        mv.addObject("categorias",categoriaService.buscarTodos());
         
        return mv;
	}
	
	@PostMapping("/material/salvar")
    public ModelAndView salvar(Material material) {
         
		materialService.salvar(material);
         
        return listar();
    }
	
	@GetMapping("/material/editar/{id}")
    public ModelAndView edit( @PathVariable("id") Integer id) {
         
        return novo( materialService.buscarPeloID(id));
    }
     
    @GetMapping("/material/remover/{id}")
    public ModelAndView delete(@PathVariable("id") Integer id) {
         
    	materialService.remover(id);
         
        return listar();
    }
	
}
