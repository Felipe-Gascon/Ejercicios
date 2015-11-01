package ejercicio28;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		//Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostrar la posición en que
		//se encuentra. Si no está, indicarlo con un mensaje.
		
		Scanner sc= new Scanner(System.in);
		int t[]= new int[10];
		int num,j;
		
		for (int i = 0; i < t.length; i++) 
		{
			System.out.println("Introduzca numero de forma creciente");
			t[i]=sc.nextInt();
		}
		System.out.println("Introduzca el numero a buscar: ");
		num=sc.nextInt();
		j=0;
		while (j<10 && t[j]<num)
		{
			j++;
		}
		
		// cuando me salgo del mientras puede ser por dos motivos:
		// - que j llegue a 10 ó
		// - que encuentre donde iría el num en la tabla
		
		if(j==10)//llegamos al final y no se ha encontrado nada
		{
			System.out.println("Numero no encontrado");
		}
		else
		{
			//si t[j]<num hemos sobrepasado el lugar donde deberia estar num, sin encontrarlo
			
			if(t[j]==num)
			{
				System.out.println("Encontrado en la posición "+j);
			}
			else
			{
				System.out.println("No encontrado");
			}
		}
	}

}
