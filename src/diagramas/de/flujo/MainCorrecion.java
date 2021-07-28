package diagramas.de.flujo;

import java.util.Scanner;

public class MainCorrecion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// correcion de la prueba
		Scanner lector = new Scanner(System.in);
		int S = 0;
		int P = 0;
		int C = 0;

		for (int i = 1; i != 0; i++) {
			System.out.println("Ingrese un numero positivo");
			int n = lector.nextInt();
			if (n == 0) {
				i = -1;

			} else {
				S = S + n;
				P = S / i;
				C = C + 1;

			}
			System.out.println("la suma es:" + S);
			System.out.println("el promedio es:" + P);
			System.out.println("la cantidad de numeros es:" + C);

		}

	}
}