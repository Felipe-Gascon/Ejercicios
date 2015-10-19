package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Pedir números hasta que se introduzca uno negativo, y calcular la media.
		Scanner sc = new Scanner(System.in);
		int num, suma, elementos;	
		float media; //la media puede tener decimales

		//num: guardara los números introducidos por el usuario
		//suma: alamacenará la suma de todos los números introducidos
		//elementos: será un contador que indicará el numero de números o elementos introducidos


		System.out.println("introduzca un número: ");
		num=sc.nextInt();
		suma=0;
		elementos=0;

		while(num>=0)//solo numeros positivos y mayores o igual a 0
		{
			suma+=num;
			elementos++;

			System.out.println("Introduzca otro número:");
			num=sc.nextInt();
		}

		if (elementos == 0)//dado que ningun numero es divisible por 0
		{
			System.out.println("Es imposible hacer la media");
		}

		else
		{
			media= (float)suma/elementos;
			System.out.println("La media es de: "+media);
		}
	}
}
