package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*Leer por teclado dos tablas de 10 n�meros enteros y mezclarlas en una tercera de la forma: el 1� de A, el 1�
		de B, el 2� de A, el 2� de B, etc.*/

		Scanner sc = new Scanner(System.in);
		int a[] = new int [10];
		int b[] = new int [10];
		int c[] = new int [20];	//la tabla c debera ser del doble de tama�o que las anteriores
		int i,j;


		//A continuaci�n leemos la tabla a;

		System.out.println("leyendo la tabla a");

		for (i=0;i<10;i++)
		{
			System.out.println("numero: ");
			a[i]= sc.nextInt();
		}

		//Leemos la tabla b
		System.out.println("leyendo la tabla b");

		for(i=0;i<10;i++)
		{
			System.out.println("n�mero: ");
			b[i]=sc.nextInt();
		}	
		
		/*
		 * Asignaremos los elementos de la tabla c
		 * para las tablas a y b utilizaremos como indice i
		 * y para la tabla c utilizarecomos como �ndice j
		 */

		j=0;
		for(i=0;i<10;i++)
		{
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;
		}
		
		System.out.println("la tabla c queda: ");
		
		for(j=0;j<20;j++)//// seguimos utilizando j, para la tabla c. Aunque se podr�a utilizar i.
		{
			System.out.print(c[j]+" ");
		}
		System.out.println("");
		
		
		
		
		
		
		
		
		
	}

}
