package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char A[][] = new char[5][5];
		for (int fila = 0; fila < 3; fila++) {
			for (int columna = 0; columna < 5; columna++) {
				System.out.println("Ingrese valor de la fila: " + fila+"columna:" +columna);
				// el usuario digita  el valor por teclado
				Scanner lector = new Scanner(System.in);
				char n = lector.next().charAt(0);
				A[fila][columna] = 0;

			}
			
		}
		System.out.println(" la mtriz sera: ");
		for (int fila = 0; fila < 5; fila++) {
			for (int columna = 0; columna < 5; columna++) {
				System.out.println( A[fila][columna]+" ");
				
			

			}
			
			
		}
		System.out.println();
	}

}
