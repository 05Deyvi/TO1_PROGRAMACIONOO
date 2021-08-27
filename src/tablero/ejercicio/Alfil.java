package tablero.ejercicio;

public class Alfil {

	public void setColor(String string) {
		// TODO Auto-generated method stub
		
		Alfil AlfilNegro1=new Alfil();
		AlfilNegro1.setColor("NEGRO");
		
		Alfil AlfilNegro2=new Alfil();
		AlfilNegro2.setColor("NEGRO");
		
		Alfil AlfilBlanco1=new Alfil();
		AlfilBlanco1.setColor("BLANCO");
		
		Alfil AlfilBlanco2=new Alfil();
		AlfilBlanco2.setColor("BLANCO");
		
		Alfil AlfilNegro [][] = new Alfil[8][8];
		AlfilNegro[0][2]=AlfilNegro1;
		AlfilNegro[0][5]=AlfilNegro2;
		
		
		Alfil AlfilBlanco [][] = new Alfil[8][8];
		AlfilBlanco[6][2]=AlfilBlanco1;
		AlfilBlanco[6][5]=AlfilBlanco2;
	}
	
	

}
