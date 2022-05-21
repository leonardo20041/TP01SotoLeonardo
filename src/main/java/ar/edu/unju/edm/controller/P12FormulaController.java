package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.P12FormulaModel;

@Controller
public class P12FormulaController {
	
	@Autowired P12FormulaModel howdy;
	@GetMapping("/calculo")
	public ModelAndView getCalculoPage(@RequestParam (name = "altura") float altura)
	{
		ModelAndView modelView = new ModelAndView("resultadoFormula");
		double stauber;
		howdy.setAltura(180);
		stauber = howdy.calculo(howdy.getAltura());
		modelView.addObject("stauber", stauber);
		return modelView;
	}

}
