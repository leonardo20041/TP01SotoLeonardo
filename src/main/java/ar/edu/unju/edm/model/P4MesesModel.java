package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class P4MesesModel 
{
	private int mes1, mes2, mes3;
	
	public String meses(int mes)
	{
		String mensaje;
			
			if (mes == 1)
				mensaje = "Enero";
			else if (mes == 2)
				mensaje = "Febrero";
			else if (mes == 3)
				mensaje = "Marzo";
			else if (mes == 4)
				mensaje = "Abril";
			else if (mes == 5)
				mensaje = "Mayo";
			else if (mes == 6)
				mensaje = "Junio";
			else if (mes == 7)
				mensaje = "Julio";
			else if (mes == 8)
				mensaje = "Agosto";
			else if (mes == 9)
				mensaje = "Septiembre";
			else if (mes == 10)
				mensaje = "Octubre";
			else if (mes == 11)
				mensaje = "Noviembre";
			else if (mes == 12)
				mensaje = "Diciembre";
			else
				mensaje = "NO EXISTE ESE MES";
		
			return mensaje;
	}
	public int getMes1() {
		return mes1;
	}
	public void setMes1(int mes1) {
		this.mes1 = mes1;
	}
	public int getMes2() {
		return mes2;
	}
	public void setMes2(int mes2) {
		this.mes2 = mes2;
	}
	public int getMes3() {
		return mes3;
	}
	public void setMes3(int mes3) {
		this.mes3 = mes3;
	}
	
	
}
