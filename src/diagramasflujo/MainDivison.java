package diagramasflujo;

import java.util.Scanner;
public class MainDivison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);
		System.out.println("ingrese un numero A:");
		   int A = teclado.nextInt();
		System.out.println("ingrese un numero B:");
		   int B = teclado.nextInt();
		   
		   if(B>0) {
				 
				 int D=A/B;
				 System.out.println("la divison es:" + D);
				   }else {
					   System.out.println("la divison es imposible");
				 
				   }
	}

}
