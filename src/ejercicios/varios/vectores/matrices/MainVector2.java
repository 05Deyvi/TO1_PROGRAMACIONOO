package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // declare un vector x cuya longitud se ssolicite al usuario de tipo int 
		// y construya un programa que pida al usuario que ingrese los valores para cada posicion
		//y finalmente que se imprima rodo los valores ingresados 
		
		System.out.println("Ingrese valor de la longitud del vector: " );
		Scanner lector = new Scanner(System.in);
		int n = lector.nextInt();
		int x[] = new int [n];

		for(int i =0; i<n; i++){
			System.out.println("Ingrese valor de la posicion: " + i);
			
			Scanner lector1 = new Scanner(System.in);
			 n = lector1.nextInt();
			 x[i]=n;
		
	}
	}
}
