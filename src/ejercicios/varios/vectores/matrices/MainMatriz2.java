package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int J[][] = new int [5][5];
	
	for (int fila = 0; fila <5; fila++) {
		for (int columna = 0; columna < 5; columna++) {
			if ( fila == columna) {
				J[fila][columna] = 1;
				
			}else{
				J[fila][columna] = 0;
				
			}
           System.out.print(J[fila][columna] + " ");
		}
		System.out.println();
	}
	}
}
