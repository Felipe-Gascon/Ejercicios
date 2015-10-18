package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*Realizar un juego para adivinar un n�mero. Para ello pedir un n�mero N, y luego ir pidiendo
		 n�meros indicando �mayor� o �menor� seg�n sea mayor o menor con respecto a N. El proceso termina
		cuando el usuario acierta.*/
		Scanner sc;
		sc = new Scanner(System.in);
		int n,num;
		
		// n es el n�mero que hay que acertar
		// num guarda los n�meros introducidos
		
		System.out.print("Introduce N: ");
		n = sc.nextInt();
		
		System.out.print("Introduce n�mero: ");
		num = sc.nextInt();
		
		while(num!=n) //mientras no coincidan
		{
			if (num>n)
			{
				System.out.println("menor");
			}
			else
			{
				System.out.println("mayor");
			}
			System.out.print("Introduce un n�mero: ");
			num = sc.nextInt();
		}
		// al salir del mientras tenemos la certeza que num es igual a n
		
		System.out.println("Acertaste...");
		
	}

}
