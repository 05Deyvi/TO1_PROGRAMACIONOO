package diagramasflujo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("ingrese dos numeros:");
    Scanner teclado =new Scanner(System.in);
    int A = teclado.nextInt();
    
   // System.out.println("numero ingresado:" + A);
    int B = teclado.nextInt();
   // System.out.println("numero ingresado 2:" + B);
    
    int S=A+B;
    int R=A-B;
    int P=A*B;
    System.out.println("la suma es:" + S);
    System.out.println("la resta es:" + R);
    System.out.println("el producto es:" + P);
	}
	

}
