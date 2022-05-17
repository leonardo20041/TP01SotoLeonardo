package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class P2BisiestoModel 
{
	private int fecha;

	public boolean bisiesto(int fecha)
	{
		boolean bandera = false;
		if ((fecha%4 == 0) && (fecha%100 != 0) || (fecha%400 == 0))
		{
			bandera = true;
		}
			
		return bandera;
	}
	
	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

}
