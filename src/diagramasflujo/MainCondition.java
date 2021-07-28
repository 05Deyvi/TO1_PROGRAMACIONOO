package diagramasflujo;

import java.util.Scanner;

public class MainCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("ingrese un numero:");
		   Scanner teclado =new Scanner(System.in);
		   int A = teclado.nextInt();
		   if(A==1) {
		 System.out.println("numero correcto:");
		 
		   }else {
		 System.out.println("numero correcto:");
		 System.out.println("El numero es:"+ A);
		   }
	}

}
