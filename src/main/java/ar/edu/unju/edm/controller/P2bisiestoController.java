package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.P2BisiestoModel;

@Controller
public class P2bisiestoController {
	
	@Autowired P2BisiestoModel bis;
	@GetMapping("/bisiesto")
	public ModelAndView getBis (@RequestParam (name = "fecha") int fecha)
	{
		ModelAndView modelView = new ModelAndView("resultadoBisiesto");
		boolean bandera = bis.bisiesto(fecha);
		String mensaje;
		if(bandera == true)
		{
			mensaje = " es Bisiesto";
		}
		else
		{
			mensaje = " NO es Bisiesto";
		}
		modelView.addObject("mensaje", mensaje);
		modelView.addObject("fecha", fecha);
		return modelView;
	}

}
