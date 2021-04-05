package Tema2Bucles;

import java.util.Scanner;

public class Acti7Pag59 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		//Variables
		int i = 4;
		int key= 1996;
		int intentos = 4;
		System.out.println("Introduce la clave de la caja fuerte.");
		int keyIntroducida = scan.nextInt();
		
		if (key == keyIntroducida) {
			System.out.println("Has introducido la clave correctamente");
		}
		else {
			do {
				i--;
				System.out.println("La clave es incorrecta, te quedan " + i + " intentos");
				System.out.println("Por favor, vuelve a introducir la clave.");
				keyIntroducida = scan.nextInt();
									
			}
			while(i>0);			
		}
	}
}
