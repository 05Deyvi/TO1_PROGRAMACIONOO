package pueba.bus;

import java.util.Scanner;

public class MainReservaVuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner tecladoInt = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);
		System.out.println("ingrese informacion de pasajero");
		System.out.println("ingrese nombre");
		String nombre = tecladoString.nextLine();
		System.out.println("ingrese apellido");
		String apellido = tecladoString.nextLine();
		System.out.println("ingrese edad");
		int edad = tecladoString.nextInt();
		System.out.println("que tipo de pasajero es: 1 pasajero vip 2:pasajero economico");
		int opcion = tecladoInt.nextInt();

		String membresia = "";
		String descuento = "";
		if (opcion == 1) {
			System.out.println("ingrese codigo membresia");
			membresia = tecladoString.nextLine();

		} else {
			System.out.println("ingrese codigo descuento");
			descuento = tecladoString.nextLine();
		}

		PasajeroVip pasajero1 = new PasajeroVip();
		pasajero1.setNombre(nombre);
		pasajero1.setApellido(apellido);
		pasajero1.setCodigoMembresia(membresia);
		pasajero1.setEdad(edad);

		PasajeroVip pasajero2 = new PasajeroVip("javier", "cruz", "asdd", 30);

		PasajeroEconomico pasajeroEconomico1 = new PasajeroEconomico();
		pasajeroEconomico1.setNombre("edison");
		pasajeroEconomico1.setApellido("cayambe");
		pasajeroEconomico1.setCodigoDescuento("65df");
		pasajeroEconomico1.setEdad(34);

		PasajeroEconomico pasajeroEconomico2 = new PasajeroEconomico();
		pasajeroEconomico2.setNombre("edison2");
		pasajeroEconomico2.setApellido("cayambe2");
		pasajeroEconomico2.setCodigoDescuento("65df");
		pasajeroEconomico2.setEdad(34);

		Pasajero[][] asientos = new PasajeroVip[4][5];
		asientos[0][0] = pasajero1;
		asientos[0][1] = pasajero2;
		asientos[0][2] = pasajeroEconomico1;
		asientos[3][2] = pasajeroEconomico2;

		int opcionSalir = 0;

		do {
			System.out.println("ingrese datos del asiento, 0 continuar, -1 Salir");
			opcionSalir = tecladoInt.nextInt();
			if (opcion == 0) {
				System.out.println("ingrese datos del asiento");
				System.out.println("ingrese fila del asiento");
				int fila = tecladoInt.nextInt();
				System.out.println("ingrese columna del asiento");
				int columna = tecladoInt.nextInt();

				System.out.println("los datos del pasajero son:");
				System.out.println(asientos[fila][columna]);
			} else if (opcionSalir == -1) {
				System.out.println("va a salir del sistema");

			}
		} while (opcionSalir != -1);

	}

}
