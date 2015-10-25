package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...

		Scanner sc = new Scanner(System.in);
		int nota;
		System.out.println("Escribe una nota");
		nota=sc.nextInt();

		if (nota<0 || nota >10)
		{
			System.out.println("Nota no valida, por favor introduzca una nota correcta");

		}
		else
		{
			if(nota<5)
			{
				System.out.println("Insuficiente");

			}
			else
			{
				if (nota==5)
				{
					System.out.println("Suficiente");
				}
				else
				{
					if(nota==6)
					{
						System.out.println("Bien");
					}
					else
					{
						if(nota==7 || nota==8)
						{
							System.out.println("Notable");
						}
						else
						{
							System.out.println("Sobresaliente");

						}
					}
				}
			}
			

		}




	}

}
