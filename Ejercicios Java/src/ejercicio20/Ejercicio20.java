package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// Pedir el d�a, mes y a�o de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 d�as.
		//Sin a�os bisiestos.

		int dia,mes,a�o;
		Scanner sc= new Scanner (System.in);

		System.out.println("Introduzca dia: ");
		dia=sc.nextInt();
		System.out.println("Introduzca mes: ");
		mes=sc.nextInt();
		System.out.println("Introduzca a�o: ");
		a�o=sc.nextInt();

		//El unico a�o que no existe es el 0
		if(a�o==0)
		{
			System.out.println("Fecha Incorrecta");

		}

		else
		{
			if(mes==2 && (dia>=1 && dia<=28))
			{
				System.out.println(dia + "/" + mes + "/" + a�o+": Fecha Correcta");
			}
			else
			{
				if((mes==4 || mes ==6 || mes==9 ||mes==11)&&(dia>=1 && dia<=30))
				{
					System.out.println(dia + "/" + mes + "/" + a�o+": Fecha Correcta");
				}
				else
				{
					if((mes==1 ||mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)&&(dia>=1 && dia <=31))
					{
						System.out.println(dia + "/" + mes + "/" + a�o+": Fecha Correcta");
					}
					else
					{
						System.out.println("Fecha Incorrecta");
					}

				}
			}
		}
	}

}
