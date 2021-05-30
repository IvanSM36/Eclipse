package Tema3Arrays;
import java.util.Scanner;

public class Acti5Pag121 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int maximo = Integer.MIN_VALUE;
	    int minimo = Integer.MAX_VALUE;
		int[] miArray = new int [10];	
		
		//Rellenamos miArray con numeros por teclado
		for (int i = 0; i < miArray.length; i++ ) {
			System.out.print("Introduzca un numero: ");
			miArray[i] = scan.nextInt();
			
			if (miArray[i] < minimo) {
				minimo = miArray[i];
			}
			if (miArray[i] > maximo) {
				maximo = miArray[i];
			}
			
		}
		
		System.out.println();
		//Mostramos miArray
		System.out.println(" Contenido de miArray ");
		System.out.println();
		
		for (int i = 0; i < miArray.length; i++) {		
			System.out.print(miArray[i] + " ");
			
			if (miArray[i] == minimo) {
				System.out.print("El minimo es: " + miArray[i]);
			}
			if (miArray[i] == maximo) {
				System.out.print("El maximos es: " + miArray[i]);
			}
			System.out.println();
		}	
		scan.close();
	}
}
