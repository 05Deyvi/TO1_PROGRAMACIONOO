package pueba.bus;

import java.util.Scanner;

import tablero.ejercicio.Principal;

public class MainBus extends Pasajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pasajero Pasajero1 = new Pasajero();
		Pasajero1.setNombre("alfonso");
		Pasajero1.setApellido("tipantuña");
		Pasajero1.setEdad(14);

		Pasajero Pasajero2 = new Pasajero();
		Pasajero2.setNombre("diego");
		Pasajero2.setApellido("guaman");
		Pasajero2.setEdad(25);

		
		Pasajero Pasajero3 = new Pasajero();
		Pasajero3.setNombre("alfonso");
		Pasajero3.setApellido("tipantuña");
		Pasajero3.setEdad(21);
		
		
		Pasajero Pasajero4 = new Pasajero();
		Pasajero4.setNombre("deyvi");
		Pasajero4.setApellido("pilataxi");
		Pasajero4.setEdad(21);
		
		Pasajero Pasajero5 = new Pasajero();
		Pasajero5.setNombre("abrahm");
		Pasajero5.setApellido("tene");
		Pasajero5.setEdad(13);
		
		Pasajero Pasajero6 = new Pasajero();
		Pasajero6.setNombre("maria");
		Pasajero6.setApellido("teran");
		Pasajero6.setEdad(13);

		
		Pasajero Pasajero7 = new Pasajero();
		Pasajero7.setNombre("sofia");
		Pasajero7.setApellido("tipantuña");
		Pasajero7.setEdad(22);
		
		Pasajero Pasajero8 = new Pasajero();
		Pasajero8.setNombre("abrahm");
		Pasajero8.setApellido("tene");
		Pasajero7.setEdad(13);
		
		Pasajero Pasajero9 = new Pasajero();
		Pasajero9.setNombre("abrahm");
		Pasajero9.setApellido("pilco");
		Pasajero9.setEdad(15);
		
		Pasajero Pasajero10 = new Pasajero();
		Pasajero10.setNombre("diana");
		Pasajero10.setApellido("tene");
		Pasajero10.setEdad(17);
		
		Pasajero Pasajero11 = new Pasajero();
		Pasajero11.setNombre("santiago");
		Pasajero11.setApellido("tene");
		Pasajero11.setEdad(18);
		

		Pasajero Pasajero12 = new Pasajero();
		Pasajero12.setNombre("maholy");
		Pasajero12.setApellido("ushca");
		Pasajero12.setEdad(15);

		
		Pasajero Pasajero13 = new Pasajero();
		Pasajero13.setNombre("aleja");
		Pasajero13.setApellido("ushca");
		Pasajero13.setEdad(22);
		
		Pasajero Pasajero14 = new Pasajero();
		Pasajero14.setNombre("soldedad");
		Pasajero14.setApellido("allaica");
		Pasajero14.setEdad(33);
		
		Pasajero Pasajero15 = new Pasajero();
		Pasajero15.setNombre("bryan ");
		Pasajero15.setApellido("guaiña");
		Pasajero15.setEdad(19);
		
		Pasajero Pasajero16 = new Pasajero();
		Pasajero16.setNombre("diego ");
		Pasajero16.setApellido("allaica");
		Pasajero16.setEdad(23);
		
		Pasajero Pasajero17 = new Pasajero();
		Pasajero17.setNombre("david");
		Pasajero17.setApellido("pilamunga");
		Pasajero17.setEdad(45);
		
		Pasajero Pasajero18 = new Pasajero();
		Pasajero18.setNombre("abrahm");
		Pasajero18.setApellido("tene");
		Pasajero18.setEdad(36);
		
		
		Pasajero Pasajero19 = new Pasajero();
		Pasajero19.setNombre("alison");
		Pasajero19.setApellido("pilataxi");
		Pasajero19.setEdad(18);
		
		Pasajero Pasajero20 = new Pasajero();
		Pasajero20.setNombre("lisbeth");
		Pasajero20.setApellido("guaman");
		Pasajero20.setEdad(18);
		
		Pasajero Asiento[][] = new Pasajero [4][5];
		 
		 System.out.println("ingrese su nuemro de asiemto");
		 Scanner lector = new Scanner(System.in);
			System.out.println("Ingrese el numero la fila de su asiento:");
			int longitudfila = lector.nextInt();
			
			System.out.println("Ingrese el numero la columna de su asiento:");
			int longitudcolumna = lector.nextInt();
			
			for (int fila = 0; fila < 4; fila++) {
				for (int columna = 0; columna < 4; columna++) {
					System.out.println("Ingrese la fila de su asiento: " + fila+"columna:" +columna);
					// el usuario digita  el valor por teclado
					Scanner lector1 = new Scanner(System.in);
					
					Pasajero n = null;
					Asiento[fila][columna] = n;

				}
				
			}
			for (int fila = 0; fila < 3; fila++) {
				for (int columna = 0; columna < 4; columna++) {
					System.out.println("su asiento es: " + fila+" y la columna: " +columna +"es;" + Asiento[fila][columna]);
					
				

				}
				
			}
			}
		
	
		
	
	

}
