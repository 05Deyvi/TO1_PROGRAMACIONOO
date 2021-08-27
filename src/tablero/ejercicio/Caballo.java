package tablero.ejercicio;

public class Caballo  {
	

	public void setColor(String string) {
		// TODO Auto-generated method stub
		
		
		
		
		Caballo CaballoNegro1 = new Caballo();
		CaballoNegro1.setColor("NEGRO");
		
		Caballo CaballoNegro2 = new Caballo();
		CaballoNegro2.setColor("NEGRO");
		
		
		Caballo CaballoBlanco1 = new Caballo();
		CaballoBlanco1.setColor("BLANCO");
		
		Caballo CaballoBlanco2 = new Caballo();
		CaballoBlanco2.setColor("BLANCO");
		
		
		Caballo CaballoNegro[][] = new Caballo[8][8];
		CaballoNegro[0][1]=CaballoNegro1;
		CaballoNegro[0][6]=CaballoNegro2;

		Caballo CaballoBlanco[][] = new Caballo[8][8];
		CaballoBlanco[6][1]=CaballoBlanco1;
		CaballoBlanco[6][6]=CaballoBlanco2;
		
		
	}

}
