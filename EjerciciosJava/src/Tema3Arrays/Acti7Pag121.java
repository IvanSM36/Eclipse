package Tema3Arrays;

import java.util.Scanner;

public class Acti7Pag121 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numero = new int[100];
		int i;

		// Rellena el array con numeros aleatorios
		for (i = 0; i < 100; i++) {
			numero[i] = (int) (Math.random() * 21);
			System.out.print(numero[i] + "  ");
		}
		System.out.println();

		System.out.print("Introduzca un numero de los que se han mostrado: ");
		int valor1 = scan.nextInt();
		System.out.println();
		System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
		int valor2 = scan.nextInt();

		System.out.println();

		for (i = 0; i < 100; i++) {
			if (numero[i] == valor1) {
				numero[i] = valor2;
				System.out.print( numero[i] + "  ");
			} else {
				System.out.print( numero[i] + "  ");
			}
		}

		System.out.println();
	}

}
