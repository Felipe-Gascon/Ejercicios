package ejercicio23;

import java.util.Scanner;

/**
 * @author Felipe
 *
 */
public class Ejercicio23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Leer 5 numeros y mostrarlos en el mismo orden introducidos
		
		int t[] = new int [5];
		Scanner sc= new Scanner (System.in);
		
		for (int i = 0; i < t.length; i++) {
			System.out.println("Introduzca un numero");
			t[i]=sc.nextInt();
		}
		System.out.println("Los numeros son: ");
		
		
		
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}

}
