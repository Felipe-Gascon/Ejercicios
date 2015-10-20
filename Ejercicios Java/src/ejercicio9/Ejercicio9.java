package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Leer 5 números y mostrarlos en el mismo orden introducido.
		Scanner sc = new Scanner(System.in);
		int t[];
		t = new int[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Introduzca un numero: ");
			t[i] = sc.nextInt();
		}
		
		System.out.println("los numeros son: ");
		
		for(int i = 0;i<5;i++)
		{
			System.out.println(t[i]);
		}

	}

}
