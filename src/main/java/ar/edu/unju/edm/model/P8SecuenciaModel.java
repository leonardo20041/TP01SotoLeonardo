package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class P8SecuenciaModel {
	
	public String secuenciap8()
	{
		String resultado = "";
		int num = 0;
		do
		{
			String aux = "";
			num = num + 4;
			aux = String.valueOf(num);
			resultado = resultado +" " +aux;
		}while(num < 100);
		
		return resultado;
	}

}
