package Tema3Arrays;

public class Acti1Pag120 {

	public static void main(String[] args) {

		int[] array = new int[12];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*10);
			System.out.println(array[i]); //comentario
		}
	}
	
}
