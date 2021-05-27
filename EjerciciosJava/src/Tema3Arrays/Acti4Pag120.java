package Tema3Arrays;

import java.util.Random;

public class Acti4Pag120 {

	public static void main(String[] args) {
		
		int [] numero = new int [20];
		int [] cuadrado = new int [20];
		int [] cubo = new int [20];
		
		// Relleno arrayNumero con numeros aleatorios
		
		for(int i = 0; i < numero.length; i++ ) {		
			numero[i] = (int) (Math.random() * 100); 
		}
		
		//Relleno arrayCuadrado con el cuadrado del contenido de arrayNumero
		
		for (int i = 0; i < cuadrado.length; i++){		
			cuadrado[i] = numero[i] * numero[i]; 
		}
		
		for(int i = 0; i < cubo.length; i++) {
			cubo[i] = cuadrado[i] * numero[i];
		}
		
		//Muestro arraynumero
		for (int i = 0; i < numero.length; i++ ) {
			System.out.println(" Numero  " + " Cuadrado  " + " Cubo ");
			System.out.print(numero[i] + " ");
			System.out.print("     |  " + cuadrado[i] );
			System.out.println("    |  " + cubo[i]);
			System.out.println();
		}
		
	}
}
