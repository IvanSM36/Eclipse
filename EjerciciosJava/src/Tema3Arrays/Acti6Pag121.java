package Tema3Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Acti6Pag121 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] miArray = new int[15];

		// Relleno miArray con numeros por teclado
		for (int i = 0; i < miArray.length; i++) {
			System.out.print("Introduzca un numero: ");
			miArray[i] = scan.nextInt();
		}
		//////////////////////////////////////////
		
		System.out.println();

		////// Muestro miArray /////////////
		System.out.println("Contenido de miArray");
		System.out.println("--------------------");
		for (int i = 0; i < miArray.length; i++) {
			System.out.print(miArray[i] + " ");
		}
		/////////////////////////////////////

		///// Guardo el ultimo numero /////
		int aux = miArray.length;
		System.out.println();
		/////////////////////////////////

		// Desplazo los numeros
		for (int i = miArray.length - 2; i >= 0; i--) {
			miArray[i + 1] = miArray[i];
		}
		//////////////////////////
		
		miArray[0] = aux;
		System.out.println();
		
		// Muestro el miArray desplazado
		System.out.println("miArray desplazados");
		System.out.println("--------------------");
		for (int i = 0; i < miArray.length; i++) {
			System.out.print(miArray[i] + " ");
		}
		////////////////////////////////
		scan.close();
	}
}
