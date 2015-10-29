package ejercicio26;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		// Leer por teclado una tabla de 10 elementos numéricos enteros y una posición (entre 0 y 9). Eliminar el
		//elemento situado en la posición dada sin dejar huecos.
		Scanner sc= new Scanner(System.in);		
		int t[]=new int[10];
		int posicion;
		
		//leemos los 10 números
		for (int i = 0; i < t.length; i++)
		{
			System.out.println("Elemento("+i+" ): ");
			t[i]=sc.nextInt();
		}
		
		// leemos la posición que nos interesa
		// suponemos que la posición está en el rango 0..9
		
		System.out.println("Posicion a eliminar: ");
		posicion=sc.nextInt();
		
		// desplazamos desde posición hasta el final todos los elementos un lugar hacia la izquierda
		// con lo que el elemento que está en posición se pierde (se borra)
		
		for (int i = posicion; i < 9; i++)
		{
			t[i]=t[i+1];      // la i llega hasta la penúltima posición,
							 // ya que dentro usamos (i+1) que es la última posición
							// así evitamos salirnos de la tabla
		}
		
		System.out.println("La tabla queda: ");
		for(int i = 0; i < 9; i++ )			// hay que tener cuidado que ahora hay un
		{
			System.out.println(t[i]);      // elemento útil menos en la tabla
		}
	}

}
