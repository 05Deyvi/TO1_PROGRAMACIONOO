package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MAainMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1. declare una matriz  A(3,4) y desarrolle un programa que vaya solicitando cada una de sus posiciones 

		char A[][] = new char[3][4];
		for (int fila = 0; fila < 3; fila++) {
			for (int columna = 0; columna < 4; columna++) {
				System.out.println("Ingrese valor de la fila: " + fila+"columna:" +columna);
				// el usuario digita  el valor por teclado
				Scanner lector = new Scanner(System.in);
				char n = lector.next().charAt(0);
				A[fila][columna] = n;

			}
			
		}
		for (int fila = 0; fila < 3; fila++) {
			for (int columna = 0; columna < 4; columna++) {
				System.out.println("el  valor de la fila: " + fila+" y la columna: " +columna +"es;" + A[fila][columna]);
				
			

			}
			
		}

	}

}
