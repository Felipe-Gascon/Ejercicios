package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		//Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace N posiciónes
		Scanner sc = new Scanner(System.in);
		int t[]=new int [10];
		int n;
		

		//leemos la tabla
		for (int i=0;i<10;i++)
		{
			System.out.println("introduzca números: ");

			t[i]=sc.nextInt();
		}

		//preguntamos cuantas posciciones se desea desplazar

		System.out.println("Posciciones a desplazar: ");
		n = sc.nextInt();

		// en el caso de desplazar una posición: necesitamos guardar solo un elemento (el último que
		// pasa a ser el primero)
		// en el caso de desplazar dos posiciones: necesitamos guardar dos elementos (penúltimo y
		// último, que pasarán a ser primero y segundo)
		// como a priori no sabemos cuantos elementos vamos a desplazar, ni cuantos elementos tenemos
		// que guardar. Una buena solución es hacer una copia de la tabla completa

		int copia[]=t.clone();
		// desplazamos hacia abajo n posiciones
		
		for(int i=0;i<10;i++)
		{
			t[i]=copia[(i+n)];
			// la tabla funciona como si fuese circular por eso utilizamos el módulo
		}
		
		System.out.println("\n\n La tabla queda: ");
		
		for (int i=0;i<10;i++)
		{
			System.out.println(t[i]);
		}
	}
}
