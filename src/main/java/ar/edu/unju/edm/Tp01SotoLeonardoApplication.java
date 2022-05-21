package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.P10SecuenciaWhileModel;
import ar.edu.unju.edm.model.P11SecuenciaDoWhileModel;
import ar.edu.unju.edm.model.P12FormulaModel;
import ar.edu.unju.edm.model.P1FactorialModel;
import ar.edu.unju.edm.model.P2BisiestoModel;
import ar.edu.unju.edm.model.P3ParModel;
import ar.edu.unju.edm.model.P4MesesModel;
import ar.edu.unju.edm.model.P6EstadoAlumnoModel;
import ar.edu.unju.edm.model.P8SecuenciaModel;
import ar.edu.unju.edm.model.P9SecuenciaForModel;

@SpringBootApplication
public class Tp01SotoLeonardoApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(Tp01SotoLeonardoApplication.class, args); //Application

//		testear metodos
		
//		punto 1
		P1FactorialModel fact = new P1FactorialModel();
		int res;
		fact.setNum(5);
		res = fact.factorial(fact.getNum());
		System.out.println(res);
		
//		punto 2
		P2BisiestoModel bis = new P2BisiestoModel();
		boolean bisiesto = false;
		bis.setFecha(2020);
		bisiesto = bis.bisiesto(bis.getFecha());
		if(bisiesto == true)
			System.out.println("Es bisiesto");
		else
			System.out.println("No bisiesto");
		
//		punto 3
		P3ParModel par = new P3ParModel();
		boolean res3 = false;
		par.setNum1(1);
		res3 = par.par(par.getNum1());
		if(res3 == true)
			System.out.println("Par");
		else
			System.out.println("Impar");
		
//		punto 4
		P4MesesModel meses = new P4MesesModel();
		String mensaje;
		meses.setMes1(4);
		mensaje = meses.meses(meses.getMes1());
		System.out.println(mensaje);
		
//		punto 6
		P6EstadoAlumnoModel curso = new P6EstadoAlumnoModel();
		String est;
		curso.setNota1(6);
		est = curso.alumno(curso.getNota1());
		System.out.println(est);
		
//		punto 8
		P8SecuenciaModel sec = new P8SecuenciaModel();
		String secuencia = "";
		secuencia = sec.secuenciap8();
		System.out.println(secuencia);
		
//		punto 9
		P9SecuenciaForModel a = new P9SecuenciaForModel();
		String b = "";
		b = a.bucleFor();
		System.out.println(b);
		
//		punto 10
		P10SecuenciaWhileModel a1 = new P10SecuenciaWhileModel();
		String b1 = "";
		b1 = a1.secuenciaWhile();
		System.out.println(b1);
		
//		punto 11
		P11SecuenciaDoWhileModel a2 = new P11SecuenciaDoWhileModel();
		String b2;
		b2 = a2.secuenciaDoWhile();
		System.out.println(b2);
		
//		punto 12
		P12FormulaModel a3 = new P12FormulaModel();
		double Res;
		a3.setAltura(180);
		Res = a3.calculo(a3.getAltura());
		System.out.println("El objeto tarda en caer " +Res +"Seg.");
	}

}
