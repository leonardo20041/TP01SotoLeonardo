package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.P11SecuenciaDoWhileModel;

@Controller
public class P11SecuenciaDoWhileController {

	@Autowired P11SecuenciaDoWhileModel us;
	@GetMapping("/secuenciaDoWhile")
	public ModelAndView getDoWhilePage()
	{
		ModelAndView modelView = new ModelAndView("resultadoDoWhile");
		String among;
		among = us.secuenciaDoWhile();
		modelView.addObject("among", among);
		return modelView;
	}
}
