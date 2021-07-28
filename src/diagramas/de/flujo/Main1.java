package diagramas.de.flujo;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);
		System.out.println("ingrese un numero:");
		   int N = teclado.nextInt();
		   
		   for(int C=N+1; C<=N+5; C++ ){
	     System.out.println("los siguientes nuemros son:" + C);
   
		   }
		   System.out.println("la impresion de los cinco numeros ha finalizado:");
	}

}
