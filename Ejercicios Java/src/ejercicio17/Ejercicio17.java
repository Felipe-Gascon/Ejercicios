package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// Pedir dos fechas y mostrar el n�mero de d�as que hay de diferencia. Suponiendo todos los meses de 30	d�as.
		Scanner sc= new Scanner(System.in);
		int dia1,mes1,a�o1;
		int dia2,mes2,a�o2;
		int total_dias;
		
		System.out.println("Fecha1: ");
		System.out.println("Introduzca dia: ");
		dia1=sc.nextInt();
		System.out.println("Introduzca mes: ");
		mes1=sc.nextInt();
		System.out.println("Introduzca a�o: ");
		a�o1=sc.nextInt();
		
		System.out.println("Fecha2: ");
		System.out.println("Introduzca dia: ");
		dia2=sc.nextInt();
		System.out.println("Introduzca mes: ");
		mes2=sc.nextInt();
		System.out.println("Introduzca a�o: ");
		a�o2=sc.nextInt();
		
		// Suponemos que las fechas introducidas son correctas
		
		//Convertimos las dos fechas a dias y calculamos la diferencia
		total_dias=dia2-dia1+30*(mes2-mes1)+365*(a�o2-a�o1);
		
		System.out.println("Dias de diferencia: " + total_dias);
		
	}

}
