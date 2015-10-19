package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y
		//la cantidad de ceros.

		Scanner sc = new Scanner(System.in);

		int num;
		int cont_ceros; // contador de ceros
		int cont_pos; // contador de positivos
		int cont_neg; // contador de negativos
		int suma_pos,suma_neg; // suma de los números positivos y negativos

		float media_pos, media_neg; // media positivos y negativos;

		cont_ceros=0;
		cont_pos=0;
		cont_neg=0;	

		suma_pos=0;
		suma_neg=0;

		for (int i=1;i<=10;i++)
		{
			System.out.println("introduce un numero");
			num=sc.nextInt();

			if (num==0)
			{
				cont_ceros++;
			}

			else
			{
				if(num>0)
				{
					cont_pos++;
					suma_pos+=num;
				}
				else
				{
					cont_neg++;
					suma_neg+=num;
				}
			}
		}

		//tratamos los ceros
		System.out.println("El numero de ceros introducidos es: "+cont_ceros);

		if (cont_pos ==0)
		{
			System.out.println("No se puede hacer la media de los positivos");
		}
		else
		{
			media_pos = (float)suma_pos/cont_pos;
			System.out.println("Media de los positivos: "+media_pos); 
		}
		
		if(cont_pos==0)
		{
			System.out.println("No se puede hacer la media de los negativos");
		}
		else
		{
			media_neg=(float)suma_neg/cont_neg;
			System.out.println("Media de los negativos: "+media_neg);
		}
	}

}
