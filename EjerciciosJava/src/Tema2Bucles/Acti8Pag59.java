package Tema2Bucles;
import java.util.Scanner;

public class Acti8Pag59 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
			
		int resultado = 0;
		System.out.println("Inserta un numero para mostrar su tabla de multiplicar");
		int num = scan.nextInt();
		System.out.println("Tabala multiplicar de " + num);
			
		for(int i = 0; i <= 10; i++) {		
			resultado = num * i;			
			System.out.println( num + " * " + i + " = " + resultado);
		}
		scan.close();
	}
}
