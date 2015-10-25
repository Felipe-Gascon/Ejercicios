package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		//  Pedir un número entre 0 y 9.999, decir si es capicúa.
		Scanner sc = new Scanner(System.in);
		int num;
		int dm,um,c,d,u;
		// 9 9 . 9 9 9 a cada guarismo lo llamaremos:
		//dm um c d u: dm (decenas de millar), um:(unidades de millar)
		// c: (centenas), d: (decenas), u: (unidades)
		
		System.out.println("introduzca un numero entre 0 y 99.999");
		num=sc.nextInt();
		
		//unidad
		u=num%10;
		num=num/10;
		
		//decenas
		d=num%10;
		num=num/10;
		
		//centeneas
		c=num%10;
		num=num/10;
		
		//unidades de millar
		
		um=num%10;
		num=num/10;
		
		//decenas de millar
		dm=num;
		
		// el número será capicúa si las cifras son iguales dos a dos por los extremos
		// las centenas no las tenemos en cuenta
		
		if(dm==u && um==d)
		{
			System.out.println("El numero es capicúa");
			
		}
		else
		{
			System.out.println("El numero no es capicúa");
		}
		
		
		
	}

}
