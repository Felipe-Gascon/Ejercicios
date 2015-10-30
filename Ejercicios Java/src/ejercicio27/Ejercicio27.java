package ejercicio27;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		//Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar (fusionar) las dos tablas en
		//una tercera, de forma que sigan ordenados. 

		Scanner sc = new Scanner(System.in);

		int a[],b[],c[];
		int i,j,k;

		a = new int[10];
		b = new int[10];

		//leemos A

		System.out.println("Datos para a: ");
		for(i = 0; i<10; i++)
		{
			System.out.println("introduzca numero (orden creciente) ");
			a[i]=sc.nextInt();
		}

		System.out.println("\n Datos para b: ");
		for(i = 0; i<10; i++)
		{
			System.out.println("introduzca numero (orden creciente) ");
			b[i]=sc.nextInt();
		}

		//creamos c

		c=new int[20];
		// comenzamos a fusionar a y b en c
		i=0; // utilizaremos i como índice de a;
		j=0; // utilizaremos j como índice de b;
		k=0; // utilizaremos k como índice de c

		while(i<10 && j<10)
		{
			if (a[i]<b[j])// nos interesa el elemento de a
			{
				c[k]=a[i];
				i++; // incrementamos i para tomar el siguiente elemento de a
			}
			else
			{
				c[k]=b[j];
				j++;
			}
			k++;
		}

		// cuando salimos de while es por que alguna de las tablas (a o b) ha llegado al final

		if (i==10)
		{
			while(j<10)
			{
				c[k]=b[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i<10)
			{
				c[k]=a[i];
				i++;
				k++;
			}
		}

		System.out.println("mostramos la tabla c: ");

		for(k=0;k<20;k++)
		{
			System.out.print(c[k] + " ");

		}
		System.out.println("");
	}

}
