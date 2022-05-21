package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.P10SecuenciaWhileModel;

@Controller
public class P10SecuenciaWhileController {
	
	@Autowired P10SecuenciaWhileModel whi;
	@GetMapping("/secuenciaWhile")
	public ModelAndView getWhilePage()
	{
		ModelAndView modelView = new ModelAndView("resultadoWhile");
		String sms = "";
		sms = whi.secuenciaWhile();
		modelView.addObject("sms", sms);
		return modelView;
	}

}
