package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.P3ParModel;

@Controller
public class P3ParController {
	
	@Autowired P3ParModel par;
	@GetMapping("/par")
	public ModelAndView getPar (@RequestParam (name = "num1") int num1, @RequestParam (name = "num2") int num2, @RequestParam (name = "num3") int num3, @RequestParam (name = "num4") int num4, @RequestParam (name = "num5") int num5)
	{
		ModelAndView modelView = new ModelAndView("resultadoPar");
		
		boolean bandera = false;
		String mensaje;
		bandera = par.par(num1);
		if(bandera == true)
			mensaje = " es Par";
		else
			mensaje = " es Impar";
		
		modelView.addObject("mensaje1", mensaje);
		modelView.addObject("num1", num1);
//		-------------------------------------------		
		bandera = false;
		bandera = par.par(num2);
		if(bandera == true)
			mensaje = " es Par";
		else
			mensaje = " es Impar";

		modelView.addObject("mensaje2", mensaje);
		modelView.addObject("num2", num2);
//		-------------------------------------------
		bandera = false;
		bandera = par.par(num3);
		if(bandera == true)
			mensaje = " es Par";
		else
			mensaje = " es Impar";
		
		modelView.addObject("mensaje3", mensaje);
		modelView.addObject("num3", num3);
//		-------------------------------------------
		bandera = false;
		bandera = par.par(num4);
		if(bandera == true)
			mensaje = " es Par";
		else
			mensaje = " es Impar";
		
		modelView.addObject("mensaje4", mensaje);
		modelView.addObject("num4", num4);
//		-------------------------------------------
		bandera = false;
		bandera = par.par(num5);
		if(bandera == true)
			mensaje = " es Par";
		else
			mensaje = " es Impar";
		
		modelView.addObject("mensaje5", mensaje);
		modelView.addObject("num5", num5);
//		-------------------------------------------
//		-------------------------------------------
		
		return modelView;
	}

}
