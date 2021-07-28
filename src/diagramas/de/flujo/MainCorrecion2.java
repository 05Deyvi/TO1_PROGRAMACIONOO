package diagramas.de.flujo;

import java.util.Scanner;

public class MainCorrecion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// correccion de la prueba 
		
		Scanner lector = new Scanner(System.in);
		int SP = 0;
		int SI = 0;
		int CI = 0;
		int PI = 0;

		for (int i = 1; i != -1; i++) {
			System.out.println("Ingrese un numero positivo");
			int n = lector.nextInt();
			if (n == 0) {
				i = -2;

			} else {
				if (n % 2 == 0) {
					SP = SP + n;

				} else {
					SI = SI + n;
					CI = CI + 1;
					PI = SI / CI;
				}
			}
			System.out.println("la suma pares es:" + SP);
			System.out.println("el promedio de impares es:" + PI);
			System.out.println("la cantidad de numeros impares es:" + CI);
			System.out.println("gracias por consultar");
		}

	}

}
