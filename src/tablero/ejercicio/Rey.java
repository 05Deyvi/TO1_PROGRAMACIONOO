package tablero.ejercicio;

public class Rey  {


	public void SetColor(String string) {
		// TODO Auto-generated method stub
	
		
		Rey ReyNegro1=new Rey();
		ReyNegro1.SetColor("NEGRO");
		
		Rey ReyBlanco1 = new Rey();
		ReyBlanco1.SetColor("BLANCO");
		 
		Rey ReyNegro [][]=new Rey[8][8];
		ReyNegro[0][3]=ReyNegro1;
		
		Rey ReyBlanco [][]=new Rey[8][8];
		ReyBlanco[0][3]=ReyNegro1;
	}
	
	
}
