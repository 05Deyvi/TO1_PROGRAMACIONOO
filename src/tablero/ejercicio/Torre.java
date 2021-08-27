package tablero.ejercicio;

public class Torre {

	public void setcolor(String string) {
		// TODO Auto-generated method stub
		
		Torre TorreNegro1=new Torre();
		TorreNegro1.setcolor("NEGRO");
		
		Torre TorreNegro2=new Torre();
		TorreNegro2.setcolor("NEGRO");
		
		Torre TorreBlanco1=new Torre();
		TorreBlanco1.setcolor("BLANCO");
		
		Torre TorreBlanco2=new Torre();
		TorreBlanco2.setcolor("BLANCO");
		
		Torre TorreNegro[][]= new Torre[8][8];
		TorreNegro[0][0]=TorreNegro1;
		TorreNegro[0][7]=TorreNegro2;
		
		
		Torre TorreBlanco[][]= new Torre[8][8];
		TorreBlanco[6][0]=TorreBlanco1;
		TorreBlanco[6][7]=TorreBlanco2;
		
	}
	
	
}
