package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MAainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declare un vector x[3] y construya un programa que pida al usuario ingrese los valores para cada posicion 
		// y finalmente que se imprima todo los valores ingresados
		
		char x[] = new char [3];
		
		for(int i =0; i<3; i++){
			System.out.println("Ingrese valor de la posicion: " + i);
			
			Scanner lector = new Scanner(System.in);
			char n = lector.next().charAt(0);
			 x[i]=n;
			 
			
		}
		// recorriendo el vector lleno
		for(int i =0; i<3; i++){
			System.out.println(" valor de la posicion: " + i);
			System.out.println( x[i]);
		
		
			
	}
	}
}
