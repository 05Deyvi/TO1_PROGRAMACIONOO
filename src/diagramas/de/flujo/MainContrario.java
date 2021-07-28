package diagramas.de.flujo;

import java.util.Scanner;

public class MainContrario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("ingrese el numero de filas:");
		
		Scanner teclado =new Scanner(System.in);
		 int n = teclado.nextInt();
		 
		 for(int fila=n;fila>=1; fila--) {
				
				System.out.println();
				
				for(int ast=1;ast<=fila;ast++){
					
					System.out.print("*");
				}
				
		 }

	}

}
