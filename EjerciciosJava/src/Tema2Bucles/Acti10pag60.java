package Tema2Bucles;

import java.util.Scanner;

public class Acti10pag60 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
			
		System.out.println("Inserte un numero para calcular la media de positivos.");
		int num;
		int i= 0;
		int suma = 0;
		int media = 0;
		
		
		do {
			num= scan.nextInt();
			if(num > 0) {			
				System.out.println("Vuelve a insertar, para salir introduzca un numero negativo.");
				i++;
				suma= suma + num;
				media = suma/i;
			}else {
				System.out.println("Fin");					
				System.out.println("La media de los numeros positivos es " + media);
			}
		}
		while(num >=0);		
	}

}
