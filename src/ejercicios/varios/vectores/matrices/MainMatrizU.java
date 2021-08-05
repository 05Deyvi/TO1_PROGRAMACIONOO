package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatrizU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lee el teclado
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese el numero de filas del vector:");
		int longitudfila = lector.nextInt();
		
		System.out.println("Ingrese el numero de columnas del vector:");
		int longitudcolumna = lector.nextInt();
		
		char A[][] = new char[longitudfila][longitudcolumna];
		for (int fila = 0; fila < longitudfila; fila++) {
			for (int columna = 0; columna < longitudcolumna; columna++) {
				System.out.println("Ingrese valor de la fila: " + fila + " columna:" +columna);
				// el usuario digita  el valor por teclado
				
				char n = lector.next().charAt(0);
				A[fila][columna] = n;

			}
			
		}
		System.out.println(" la mtriz sera: ");
		for (int fila = 0; fila < longitudfila; fila++) {
			for (int columna = 0; columna < longitudcolumna; columna++) {
				System.out.print( A[fila][columna]);
				
			

			}
			System.out.println();
		}

	}

}
