package diagramas.de.flujo;

import java.util.Scanner;

public class MainWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int S = 0;
		int P = 0;
		int C = 0;
		
		
		System.out.println("Ingrese un numero positivo");
		  int n = lector.nextInt();
		while(n!=0) {
			System.out.println("Ingrese un numero positivo");
		  n = lector.nextInt();
		  
		  S = S + n;
		  P = n/S;
		  C = C+1;
		}
		   
		    
		
		System.out.println("la suma es:" +S);
		System.out.println("el promedio es:" +P);
		System.out.println("la cantidad es:" +C);
	}
}
