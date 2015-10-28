package ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		//Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
		//negativo.
		Scanner sc = new Scanner (System.in);
		int num,cuadrado;
		// num guardará el número que leamos
		// y cuadrado guardará el cuadrado de num

		System.out.println("Introduzca un numero");
		num=sc.nextInt();


		while (num>=0) 
		{
			cuadrado=num*num;
			System.out.println(num+" es igual a: "+cuadrado);
			System.out.println("introduzca otro numero: ");
			num=sc.nextInt();//volvemos a leer num
		}
		
	}

}
