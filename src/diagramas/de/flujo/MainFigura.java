package diagramas.de.flujo;

import java.util.Scanner;

public class MainFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ingrese el numero de filas:");
		
		Scanner teclado =new Scanner(System.in);
		 int N = teclado.nextInt();
		 
		 for( int fila = 1; fila <= N; fila = fila+1) {
			
			 for( int ast = 1; ast <=fila; ast = ast+1) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}

}
