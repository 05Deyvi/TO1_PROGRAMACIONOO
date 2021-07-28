package diagramasflujo;

import java.util.Scanner;
public class MainSueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bienvenido a su consulta¡¡");
		System.out.println("ingrese su sueldo:");
		 
		  Scanner teclado =new Scanner(System.in);
		  int S = teclado.nextInt();
		  
		  if(S<300) {
		    	int B = 100;
		    	int N = S + B;
		    	System.out.println("su sueldo neto es :" + N);
		    	} else if (S>=300 && S>=400){
		        int B = 70;
		        int N = B+S;
		        System.out.println("su sueldo neto es :" + N);
		    	} else {
		    		int B = 50;
		    		int N = B +S ;
		    		
		        System.out.println(" su sueldo es:" + N);
		    	}
					 
		  System.out.println("Gracias por su consulta¡¡");
	}

}
