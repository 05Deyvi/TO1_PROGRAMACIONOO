package tablero.ejercicio;

public class Reina {
	


	public void SetColor(String string) {
		// TODO Auto-generated method stub
		Reina ReinaNegro1=new Reina();
		ReinaNegro1.SetColor("NEGRO");
		
		Reina ReinaBlanco1=new Reina();
		ReinaBlanco1.SetColor("NEGRO");
		
		Reina ReinaNegro[][]= new Reina [8][8];
		ReinaNegro[0][4]=ReinaNegro1;
		
	
		Reina ReinaBlanco[][]= new Reina [8][8];
		ReinaBlanco[6][4]=ReinaBlanco1;
		
	}

}
