package Tema2Bucles;

import java.util.Scanner;

// Para contar las cifras de u numero entero se debe dividir el numero entero /10 hasta que el cociente de 0

public class Acti9Pag59 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Inserte un numero para contar sus cifras.");
		int num= scan.nextInt();
		int cifras;
				
		for (cifras =0; num!=0 ; cifras++ ) {
			
			num = num/10;
		}		
		
		System.out.println("El numero tiene " + cifras + " cifras." );	
	}
}
