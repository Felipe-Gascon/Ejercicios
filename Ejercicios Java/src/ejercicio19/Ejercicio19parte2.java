package ejercicio19;

import java.util.Scanner;

public class Ejercicio19parte2 {

	public static void main(String[] args) {
		// Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...

		Scanner sc = new Scanner(System.in);
		int nota;
		System.out.println("Escribe una nota");
		nota=sc.nextInt();
		
		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("INSUFICIENTE");
			break;
		case 5:
			System.out.println("SUFICIENTE");
			break;
		case 6:
			System.out.println("BIEN");
			break;
		case 7:
		case 8:
			System.out.println("NOTABLE");
			break;
		case 9:
		case 10:
			System.out.println("SOBRESALIENTE");
			break;
		default:
			System.out.println("ERROR");
			break;
		}

	}

}
