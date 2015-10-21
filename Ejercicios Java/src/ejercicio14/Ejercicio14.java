package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		//Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la
		//forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
		Scanner sc = new Scanner(System.in);
		int a[], b[], c[];
		int i,j;
		a=new int[12];
		b=new int[12];
		c=new int[24];

		//leemos la tabla a
		System.out.println("Leyendo la tabla a");
		for (i=0;i<12;i++)
		{
			System.out.println("Numero: ");
			a[i]=sc.nextInt();
		}

		//leemos la tabla b

		System.out.println("Leyendo la tabla b");
		for(i=0;i<12;i++)
		{
			System.out.println("Numero: ");
			b[i]=sc.nextInt();
		}	


		// asignaremos los elementos de la tabla c
		// para las tablas a y b utilizaremos como índice i
		// y para la tabla c utilizaremos como índice j.

		j=0;
		i=0;
		while(i<12)
		{
			//copiamos 3 de a

			for(int k=0;k<3;k++)
			{
				c[j]=a[i+k];
				j++;
			}

			// copiamos 3 de b
			for(int k=0;k<3;k++)
			{
				c[j]=b[i+k];
				j++;
			}

			// como hemos copiado 3 de a y b, incrementamos la i en 3.

			i+=3;

			//la j se incrementa cada vez que se añade un elemento a la tabla c.
		}

		System.out.println("la tabla c queda: ");
		
		for(j=0;j<24;j++)
		{
			System.out.print(c[j]+" ");
		}
		
	}

}
