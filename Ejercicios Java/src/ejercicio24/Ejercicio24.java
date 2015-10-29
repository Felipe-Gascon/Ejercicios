package ejercicio24;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		// Leer 5 números y mostrarlos en orden inverso al introducido.
		Scanner sc = new Scanner(System.in);
		int t[]= new int [5];

		for (int i = 0; i < t.length; i++) 
		{
			System.out.println("introduce un numero");
			t[i]=sc.nextInt();
		}
		
		System.out.println("Los numeros introducidos son:");
		
		for (int i=4; i >= 0; i--) //se recorren los en orden inverso
		{
			System.out.println(t[i]);
		}

	}

}
