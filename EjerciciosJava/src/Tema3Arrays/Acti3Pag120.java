package Tema3Arrays;
import java.util.Scanner;

public class Acti3Pag120 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int[] miArray = new int[10];
		
		//Relleno miArray con numeros que introduzco.
		for (int i = 0; i < miArray.length; i++) {
			System.out.println("Introduzca un numero.");
			miArray[i] = scan.nextInt();
		}
		
		//Para Mostrar el contenido de miArray
		System.out.println("Contenido de miArray:");
		for (int i = 9; i >= 0; i--) {
			System.out.print(miArray[i] + " ");
		}
	}
}
