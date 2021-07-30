package diagramas.de.flujo;

import java.util.Scanner;

public class MainDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		int SP = 0;
		int SI = 0;
		int CI = 0;
		int PI = 0;
		
		System.out.println("Ingrese un numero positivo");
		int n = lector.nextInt();
		do {
			System.out.println("Ingrese un numero positivo");
			 n = lector.nextInt();
			 if((n&2)==0){
		     	   SP=SP+n;
		        
		        }else {
		     	   SI=SI+n;
		     	   CI=CI+1;
		     	   PI=PI/CI;
		        }
		} while (n !=-1);
		
           System.out.println("la suma par es:"+SP);
           System.out.println("el promedio impar es:"+ PI);
           System.out.println("la suma impar es:" + SI);
           System.out.println("la cantidad impar es:"+ CI);
           
           
	}

}
