package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.P6EstadoAlumnoModel;

@Controller
public class P6EstadoAlumnoController {
	
	@Autowired P6EstadoAlumnoModel alu;
	@GetMapping("/alumno")
	public ModelAndView getEstado (@RequestParam (name = "nota1") int nota1, @RequestParam (name = "nota2") int nota2, @RequestParam (name = "nota3") int nota3, @RequestParam (name = "fuera") int fuera)
	{
		ModelAndView modelView = new ModelAndView("resultadoEstado");
		String estado;
		alu.setNota1(nota1);
		estado = alu.alumno(alu.getNota1());
		modelView.addObject("estado1", estado);
		modelView.addObject("nota1", nota1);
		
		alu.setNota2(nota2);
		estado = alu.alumno(alu.getNota2());
		modelView.addObject("estado2", estado);
		modelView.addObject("nota2", nota2);
		
		alu.setNota3(nota3);
		estado = alu.alumno(alu.getNota3());
		modelView.addObject("estado3", estado);
		modelView.addObject("nota3", nota3);
		
		alu.setFuera(fuera);
		estado = alu.alumno(alu.getFuera());
		modelView.addObject("estado4", estado);
		modelView.addObject("fuera", fuera);
		
		return modelView;
		
	}

}
