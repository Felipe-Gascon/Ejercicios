package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Pedir n�meros hasta que se introduzca uno negativo, y calcular la media.
		Scanner sc = new Scanner(System.in);
		int num, suma, elementos;	
		float media; //la media puede tener decimales

		//num: guardara los n�meros introducidos por el usuario
		//suma: alamacenar� la suma de todos los n�meros introducidos
		//elementos: ser� un contador que indicar� el numero de n�meros o elementos introducidos


		System.out.println("introduzca un n�mero: ");
		num=sc.nextInt();
		suma=0;
		elementos=0;

		while(num>=0)//solo numeros positivos y mayores o igual a 0
		{
			suma+=num;
			elementos++;

			System.out.println("Introduzca otro n�mero:");
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
