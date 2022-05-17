package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.P1FactorialModel;

@Controller
public class P1FactorialController {
	
//	Autowired es como crear un objeto
	@Autowired P1FactorialModel factorial;
	@GetMapping("/factorial")
	public ModelAndView getFact(@RequestParam (name = "num") int num)
	{
		int resultadoFac = factorial.factorial(num);
		
//		Entre comillas el archivo html donde se va a mostrar el resultado, mandar el resultado a la vista
		ModelAndView modelView = new ModelAndView("resultadoFactorial");
		modelView.addObject("resultadoFac", resultadoFac);
		modelView.addObject("numero", num);
		
		return modelView;
	}
	
	

}
