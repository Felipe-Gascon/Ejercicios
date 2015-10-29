
package ejercicio25;

import java.util.Scanner;

/**
 * @author Felipe
 *
 */
public class Ejercicio25 {


	public static void main(String[] args) {
		// Leer 5 elementos numericos que se introduciran ordenados de forma creciente. Estos los guardaremos en una tabla de tamaño 10
		//leer un numero n, e insertarlo en el lugar adecuado par aque la tabla continue ordenada
		Scanner sc = new Scanner(System.in);
		int num,sitio_num,j;
		int t[]=new int [10];

		for (int i = 0; i < t.length; i++) 
		{
			System.out.println("Intoduzca un numero ordenado de forma creciente: ");
			t[i]=sc.nextInt();
		}

		System.out.println("Numero a insertar entre los anteriores");
		num=sc.nextInt();

		sitio_num=0;
		j=0;

		//buscamos el sitio donde deberia ir num

		while (t[j]<num && j<=4) {
			sitio_num++;
			j++;

		}

		//desplazaremos los elmentos desde el sitio_num hasta el final
		//De esta forma haremos un hueco para num
		for (int i = 4; i>=sitio_num; i--)
		{
			t[i+1]=t[i]; //al valor de t en ese momento lo voy desplazando una posicion 

		}

		//ponemos num en su sitio para que este todo ordenado
		t[sitio_num]=num;

		System.out.println("La nueva serie ordenada queda asi: ");


		for (int i = 0; i < 5+1; i++) 
		{
			System.out.println(t[i]);
		}	



	}

}
