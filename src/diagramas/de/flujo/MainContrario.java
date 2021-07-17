package diagramas.de.flujo;

import java.util.Scanner;

public class MainContrario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Revisando el trabajo
System.out.println("ingrese el numero de filas:");
		
		Scanner teclado =new Scanner(System.in);
		 int n = teclado.nextInt();
		 
		 for( int i = n; i <= 1; i--) {
			
			 for( int j = 1; j <= i; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }

	}

}
