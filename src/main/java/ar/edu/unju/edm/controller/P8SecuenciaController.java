package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.P8SecuenciaModel;

@Controller
public class P8SecuenciaController {
	
	@Autowired P8SecuenciaModel Sec;
	@GetMapping("/secuenciap8")
	public ModelAndView getSecuenciaPage()
	{
		ModelAndView modelView = new ModelAndView("resultadoSecuencia");
		String secuenciaNum = "";
		secuenciaNum = Sec.secuenciap8();
		modelView.addObject("secuenciaNum", secuenciaNum);
		
		return modelView;
	}

}
