package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		//Pedir el radio de una circunferencia y calcular su longitud.
		double l,r; //longitud y radio
		Scanner sc;
		
		sc = new Scanner(System.in);
		System.out.println("Introduce el radio de una circunferencia: ");
		r = sc.nextInt();
		
		l=2*Math.PI*r;
		
		System.out.println("la longitud de una circunferencia de radio " + r + " es: "+l);
	}

}
