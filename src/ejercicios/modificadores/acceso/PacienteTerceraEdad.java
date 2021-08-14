package ejercicios.modificadores.acceso;

public class PacienteTerceraEdad extends Paciente{
	
	public void examenProstata() {
		System.out.println("su nombre es: " + nombre);
		System.out.println("su diagnostico es:  " + diagnostico);
		realizarDiagnostico();
		
		
	}

}
