package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		//Pedir dos números y decir si son iguales o no.
		
		Scanner sc;
		sc = new Scanner(System.in);
		int n1,n2;
		
		System.out.println("Introduce un número: ");
		n1=sc.nextInt();
		System.out.println("introduce otro número: ");
		n2=sc.nextInt();
		
		if (n1==n2) {
			System.out.println("Los números son iguales");
			
		}else{
			System.out.println("Los números no coinciden");
		}
		
		
		
	}
}
