package ejercicios1;

import java.util.Arrays;

public class MainEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados armando = new Empleados();
		armando.setNombre("ARMANDO");
		armando.setApellido("chaca");
		armando.setEdad(30);
		armando.setSalario(250);
		
		
		Empleados julio = new Empleados();
		julio.setNombre("JULIO");
		julio.setApellido("ZAMBRANO");
		julio.setEdad(32);
		julio.setSalario(150);
		
		
		Empleados francisco = new Empleados();
		francisco.setNombre("FRANCISCO");
		francisco.setApellido("BENALCAZAR");
		francisco.setEdad(33);
		francisco.setSalario(450);
		
		
		Empleados mario = new Empleados();
		mario.setNombre("MARIO");
		mario.setApellido("CASTILLO");
		mario.setEdad(28);
		mario.setSalario(170);
		
		
		Empleados marta = new Empleados();
		marta.setNombre("MARTA");
		marta.setApellido("BADILLO");
		marta.setEdad(27);
		marta.setSalario(225);
		
		
		Empleados jenny = new Empleados();
		jenny.setNombre("JENNY");
		jenny.setApellido("GUAMAN");
		jenny.setEdad(18);
		jenny.setSalario(200);
		
		
		Empleados maria = new Empleados();
		maria.setNombre("MARIA");
		maria.setApellido("OBANDO");
		maria.setEdad(32);
		maria.setSalario(450);
		
		Empleados sofia = new Empleados();
		sofia.setNombre("SOFIA");
		sofia.setApellido("TERAN");
		sofia.setEdad(26);
		sofia.setSalario(325);
		
		
		Empleados deyvi = new Empleados();
		deyvi.setNombre("DEYVI");
		deyvi.setApellido("PILATAXI");
		deyvi.setEdad(21);
		deyvi.setSalario(280);
	
		
		Empleados alisson = new Empleados();
		alisson.setNombre("ALISSON");
		alisson.setApellido("GUAIÑA");
		alisson.setEdad(23);
		alisson.setSalario(740);
		
		Empleados SalarioEmpleados[] = new Empleados[10];
		SalarioEmpleados[0]=armando;
		SalarioEmpleados[1]=julio;
		SalarioEmpleados[2]=francisco;
		SalarioEmpleados[3]=mario;
		SalarioEmpleados[4]=marta;
		SalarioEmpleados[5]=jenny;
		SalarioEmpleados[6]=maria;
		SalarioEmpleados[7]=sofia;
		SalarioEmpleados[8]=deyvi;
		SalarioEmpleados[9]=alisson;
				
		//Vector antes de ordenar
		System.out.println("Empleados antes de ordenar");
		System.out.println(Arrays.toString(SalarioEmpleados));

		//Aqui ordeno la lista
		Arrays.sort(SalarioEmpleados);
		System.out.println("Empleados despues de ordenar");
		System.out.println(Arrays.toString(SalarioEmpleados));

	}

}
