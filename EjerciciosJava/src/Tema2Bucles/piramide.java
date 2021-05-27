package Tema2Bucles;

import java.util.Scanner;

public class piramide {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduzca el caracter para dibujar la piramide.");
		String dibujar = scan.next();

		System.out.println("Introduzca la altura de la piramide.");
		int altura = scan.nextInt();

		int capas = 1;
		int planta = 0;
		int espacios = altura - 1;

		while (planta <= altura) {

			// inserta espacios
			for (int i = 0; i <= espacios; i++) {
				System.out.print(" ");
			}
			// Pinta la linea
			for (int i = 1; i <= capas; i++) {
				System.out.print(dibujar);
			}

			System.out.println();

			planta++;
			espacios--;
			capas += 2;
		}
	}
}
