package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		//Pedir dos n�meros y decir si son iguales o no.
		
		Scanner sc;
		sc = new Scanner(System.in);
		int n1,n2;
		
		System.out.println("Introduce un n�mero: ");
		n1=sc.nextInt();
		System.out.println("introduce otro n�mero: ");
		n2=sc.nextInt();
		
		if (n1==n2) {
			System.out.println("Los n�meros son iguales");
			
		}else{
			System.out.println("Los n�meros no coinciden");
		}
		
		
		
	}
}
