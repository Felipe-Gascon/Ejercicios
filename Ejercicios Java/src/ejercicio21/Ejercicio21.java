package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// Pedir dos n�meros y decir si uno es m�ltiplo del otro.
		
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		
		System.out.println("Introduce un n�mero: ");
		n1=sc.nextInt();
		
		System.out.println("Introduce otro n�mero");
		n2=sc.nextInt();
		
		
		if(n1%n2==0)
		{
			System.out.println("Son multiplos");
			
		}
		
		else
		{
			System.out.println("No son multiplos");
		}
	}

}
