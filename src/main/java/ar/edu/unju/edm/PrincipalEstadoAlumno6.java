package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.P6EstadoAlumnoModel;


//pendiente a modificar
@SpringBootApplication
public class PrincipalEstadoAlumno6 {

	public static void main(String[] args) 
	{
		SpringApplication.run(PrincipalEstadoAlumno6.class, args);
		P6EstadoAlumnoModel curso = new P6EstadoAlumnoModel();
		String est;
		curso.setNota1(6);
		est = curso.alumno(curso.getNota1());
		System.out.println(est);
		
	}

}
