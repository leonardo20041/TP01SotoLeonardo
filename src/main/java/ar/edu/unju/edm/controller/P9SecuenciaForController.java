package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.P9SecuenciaForModel;

@Controller
public class P9SecuenciaForController {
	
	@Autowired P9SecuenciaForModel ola;
	@GetMapping("/bucleFor")
	public ModelAndView getForPage()
	{
		ModelAndView modelView = new ModelAndView("resultadoFor");
		String msj = "";
		msj = ola.bucleFor();
		modelView.addObject("msj", msj);
		
		return modelView;
	}
}
