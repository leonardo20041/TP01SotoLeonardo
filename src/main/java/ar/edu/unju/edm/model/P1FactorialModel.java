package ar.edu.unju.edm.model;
//clase

import org.springframework.stereotype.Component;

@Component
public class P1FactorialModel 
{
	private int num;

	public int factorial(int num)
	{
		int acu = 1;
		if ((num > 0) && (num <= 10))
		{
			for (int aux = 1; aux <= num; aux++)
			{
				acu = acu*aux;
			}
			return acu;
		}
		else
		{
			System.out.println("FUERA DEL RANGO");
			return 0;
		}
			
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}