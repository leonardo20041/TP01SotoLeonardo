package punto6;

//pendiente a modificar
import java.util.Scanner;

public class Punto6 
{
	Scanner leer = new Scanner(System.in);
	public void alumno()
	{
		int nota = 1;
		
		while((nota > 0) && (nota <= 10)) 
		{
			System.out.println("\nDigite la nota del alumno: ");
			nota = leer.nextInt();
			
			if (nota == 6)
				System.out.println("Alumno regulariza");
			
			else if ((nota >= 7) && (nota <= 10))
				System.out.println("El alumno promociona");
			
			else if ((nota < 6) && (nota >= 1))
				System.out.println("El alumno desaprueba");
		
		}
		System.out.println("Valor no permitido");
	
	}
}