package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class P11SecuenciaDoWhileModel {

	public String secuenciaDoWhile()
	{
		String sus = "";
		int number = 320;
		do
		{
			String aux;
			aux = String.valueOf(number);
			sus = sus +" " +aux;
			number = number - 20;
		}while(number >= 160);
		return sus;
	}
}
