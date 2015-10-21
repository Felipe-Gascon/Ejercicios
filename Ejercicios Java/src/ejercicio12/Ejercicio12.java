package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/* Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el 
		 * penúltimo, el tercero, etc.*/
		
		Scanner sc = new Scanner(System.in);
		int i,t[];
		t=new int [10];
		
		
		for(i=0;i<10;i++)
		{
			System.out.println("introduzca un numero: ");
			t[i]=sc.nextInt();
		}
		
		
		System.out.println("El resultado es: ");
		
		for(i=0;i<=4;i++)
		{
			System.out.println(t[i]);
			System.out.println(t[9-i]);
		}
	}

}
