package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.P4MesesModel;

@Controller
public class P4MesesController {
	
	@Autowired P4MesesModel mes;
	@GetMapping("/meses")
	public ModelAndView getMes (@RequestParam (name = "mes1") int mes1, @RequestParam (name = "mes2") int mes2, @RequestParam (name = "mes3") int mes3)
	{
		ModelAndView modelView = new ModelAndView("resultadoMes");
		String mensaje;
		mes.setMes1(mes1);
		mensaje = mes.meses(mes.getMes1());
		modelView.addObject("mensaje1", mensaje);
		modelView.addObject("mes1", mes1);
		
		mes.setMes2(mes2);
		mensaje = mes.meses(mes.getMes2());
		modelView.addObject("mensaje2", mensaje);
		modelView.addObject("mes2", mes2);
		
		mes.setMes3(mes3);
		mensaje = mes.meses(mes.getMes3());
		modelView.addObject("mensaje3", mensaje);
		modelView.addObject("mes3", mes3);
		
		return modelView;
	}

}
