package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class P9SecuenciaForModel {
	
	public String bucleFor()
	{
		String numeros = "";
		for(int num=320; num>=160; num=num-20)
		{
			String aux = "";
			aux = String.valueOf(num);
			numeros = numeros +" " +aux;
		}
		return numeros;
	}
}
