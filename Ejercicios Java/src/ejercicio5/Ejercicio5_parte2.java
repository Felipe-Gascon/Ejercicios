package ejercicio5;
import java.util.Scanner;

public class Ejercicio5_parte2 {

	public static void main(String[] args) {
		int n, num;
		// n es el n�mero que hay que acertar
		// num guarda los n�meros introducidos
		Scanner sc;
		sc = new Scanner(System.in);

		n=(int)(Math.random()*100)+1;
		// en lugar de pedir n... podemos hacer que se n tome un valor
		// aleatorio entre 1 y 100.
		// As� el juego es algo m�s entretenido.

		System.out.println("Introduce un n�mero: ");
		num = sc.nextInt();
		while(num !=n)
		{
			if(num>n)
			{
				System.out.println("Mayor");
			}
			else
			{
				System.out.println("Menor");
			}
			System.out.println("Introduce un n�mero");
			num=sc.nextInt();
		}
		// al salir del mientras tenemos la certeza que num es igual a n
		System.out.println("acertaste...");
	}

}
