package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class P12FormulaModel {
	private float g = 9.81f;
	private float altura;

	public double calculo(float altura)
	{
		double resultado;
		resultado = Math.sqrt((2*altura)/g);
		
		return resultado;
	}
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
}
