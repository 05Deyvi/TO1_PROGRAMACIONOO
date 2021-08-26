package deberes.de.programacion;

public class ConsultorioPatronato implements ConsultorioInterfaz {


	public void SolicitarDatos() {
		// TODO Auto-generated method stub
		
		System.out.println("nombre:");
		System.out.println("apellido");
		System.out.println("numCedula");
		
	}

	
	public void Pedircarnet() {
		// TODO Auto-generated method stub
		System.out.println("solicitar carnet para verificar si es cliente de ese consultorio");
	}

	
	public void PedirSintomas() {
		// TODO Auto-generated method stub
		
		System.out.println("pedir sintomas del paciente para relizar el diagnosticoa");
	}

	
	public void RealizarDiagnostico() {
		// TODO Auto-generated method stub
		System.out.println("realizar dicho diagnostico con los sintomas presentados por el paciente");
	}

	
	public void PagarConsulta() {
		// TODO Auto-generated method stub
		System.out.println("el patronato es gratiuto y no necesita pagar ");
	}
	

}
