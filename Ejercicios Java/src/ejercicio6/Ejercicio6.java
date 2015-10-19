package ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		//Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
		int num;
		System.out.println("Introduzca un numero: ");
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		
		while (num!=0)
		{
			if(num%2 ==0){
				System.out.println("par");
			}
			else
			{
				System.out.println("Impar");
			}
			
			System.out.println("Introduce otro numero");
			num=sc.nextInt();
		}	
		System.out.println("Game Over....");
	}

}
