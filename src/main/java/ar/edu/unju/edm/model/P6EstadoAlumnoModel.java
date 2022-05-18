package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class P6EstadoAlumnoModel
{
	private int nota1, nota2, nota3, fuera;
	public String alumno(int nota)
	{
		String estado = "";
			
			if (nota == 6)
				estado = "el Alumno Regulariza";
			
			else if ((nota >= 7) && (nota <= 10))
				estado = "el Alumno Promociona";
			
			else if ((nota < 6) && (nota >= 1))
				estado = "el Alumno Desaprueba";
			else
				estado = "Valor no permitido";
			
		return estado;
	
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public int getNota3() {
		return nota3;
	}
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
	public int getFuera() {
		return fuera;
	}
	public void setFuera(int fuera) {
		this.fuera = fuera;
	}
	
	
}