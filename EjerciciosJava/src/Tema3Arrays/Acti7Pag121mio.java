package Tema3Arrays;

import java.util.Scanner;

public class Acti7Pag121mio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] random = new int[100];

		// Relleno El array con numeros randoms
		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 21);
		}
		////////////////////////////////////////

		//// Muestro el contenido del array randoms
		System.out.println("100 Numeros Randoms");
		System.out.println("-------------------");
		for (int i = 0; i < random.length; i++) {
			System.out.print(random[i] + "  ");
		}
		/////////////////////////////////////////

		System.out.println();
		System.out.println();

		//// Pregunto que valores quiere cambiar
		System.out.print("Introduzca un numero de los mostrados para cambiar: ");
		int valor1 = scan.nextInt();
		System.out.print("Introduzca el nuevo valor: ");
		int valor2 = scan.nextInt();

		//// Muestro el array con los valores cambiados.

		for (int i = 0; i < random.length; i++) {
			if (random[i] == valor1) {
				random[i] = valor2;
			} 
			System.out.print(random[i] + "  ");
		}
		scan.close();
	}
}
