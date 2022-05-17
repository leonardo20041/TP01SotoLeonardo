package punto6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//pendiente a modificar
@SpringBootApplication
public class Principal6 {

	public static void main(String[] args) 
	{
		SpringApplication.run(Principal6.class, args);
		Punto6 curso = new Punto6();
		System.out.println("--- VERIFICAR NOTAS DE ALUMNOS ---");
		curso.alumno();
		
	}

}
