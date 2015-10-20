package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Leer 5 numeros y mostrarlos en orden inverso al introducido
		int t[]=new int[5];
		Scanner sc = new Scanner(System.in);
		
		for ( int i=0;i<5;i++)
		{
			System.out.println("Introduzca un numero:");
			t[i]=sc.nextInt();
		}
		
		System.out.println("Los numeros en orden inverso son: ");
		
		for(int i=4;i>=0;i--)
		{
			System.out.println(t[i]);
		}
	}

}
