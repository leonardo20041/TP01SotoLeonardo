package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class P10SecuenciaWhileModel {
	
	public String secuenciaWhile()
	{
		String valores = "";
		int num = 320;
		while(num >= 160)
		{
			String aux = "";
			aux = String.valueOf(num);
			valores = valores +" " +aux;
			num = num - 20;
		}
		return valores;
	}

}
