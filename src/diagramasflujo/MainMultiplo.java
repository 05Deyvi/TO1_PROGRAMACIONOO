package diagramasflujo;

import java.util.Scanner;

public class MainMultiplo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);
		System.out.println("ingrese un numero A:");
		   int A = teclado.nextInt();
		System.out.println("ingrese un numero B:");
		   int B = teclado.nextInt();
		
		    
		    int R=A%B;
		    
		    if(R==0) {
		    	System.out.println(A+"si es multiplo de:"+ B);
		    } 
		    else {
				 System.out.println(A+"no es multiplo de:" + B);
	}
	}
}
