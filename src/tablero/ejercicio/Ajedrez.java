package tablero.ejercicio;

import java.util.Arrays;

public class Ajedrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Peon PeonNegro1=new Peon();
		PeonNegro1.setColor("NEGRO");
		
		Peon PeonNegro2=new Peon();
		PeonNegro2.setColor("NEGRO");
		
		Peon PeonNegro3=new Peon();
		PeonNegro3.setColor("NEGRO");
		
		Peon PeonNegro4=new Peon();
		PeonNegro4.setColor("NEGRO");
		
		
		Peon PeonNegro5=new Peon();
		PeonNegro5.setColor("NEGRO");
		
		Peon PeonNegro6=new Peon();
		PeonNegro6.setColor("NEGRO");
		
		Peon PeonNegro7=new Peon();
		PeonNegro7.setColor("NEGRO");
		
		Peon PeonNegro8=new Peon();
		PeonNegro8.setColor("NEGRO");
			
		Peon PeonBlanco1=new Peon();
		PeonBlanco1.setColor("BLANCO");
		
	
		Peon PeonBlanco2=new Peon();
		PeonBlanco2.setColor("BLANCO");
	
		Peon PeonBlanco3=new Peon();
		PeonBlanco3.setColor("BLANCO");
		
		
		Peon PeonBlanco4=new Peon();
		PeonBlanco4.setColor("BLANCO");
		
		Peon PeonBlanco5=new Peon();
		PeonBlanco5.setColor("BLANCO");
		
		Peon PeonBlanco6=new Peon();
		PeonBlanco6.setColor("BLANCO");
		
		Peon PeonBlanco7=new Peon();
		PeonBlanco7.setColor("BLANCO");
		
		Peon PeonBlanco8=new Peon();
		PeonBlanco8.setColor("BLANCO");
		
		
		Caballo CaballoNegro1 = new Caballo();
		CaballoNegro1.setColor("NEGRO");
		
		Caballo CaballoNegro2 = new Caballo();
		CaballoNegro2.setColor("NEGRO");
		
		Caballo CaballoBlanco1 = new Caballo();
		CaballoBlanco1.setColor("BLANCO");
		
		Caballo CaballoBlanco2 = new Caballo();
		CaballoBlanco2.setColor("BLANCO");
		
		
		Torre TorreNegro1=new Torre();
		TorreNegro1.setcolor("NEGRO");
		
		Torre TorreNegro2=new Torre();
		TorreNegro2.setcolor("NEGRO");
		
		Torre TorreBlanco1=new Torre();
		TorreBlanco1.setcolor("BLANCO");
		
		Torre TorreBlanco2=new Torre();
		TorreBlanco2.setcolor("BLANCO");
		
		
		Alfil AlfilNegro1=new Alfil();
		AlfilNegro1.setColor("NEGRO");
		
		Alfil AlfilNegro2=new Alfil();
		AlfilNegro2.setColor("NEGRO");
		
		Alfil AlfilBlanco1=new Alfil();
		AlfilBlanco1.setColor("BLANCO");
		
		Alfil AlfilBlanco2=new Alfil();
		AlfilBlanco2.setColor("BLANCO");
		
		Reina ReinaNegro1=new Reina();
		ReinaNegro1.SetColor("NEGRO");
		
		Reina ReinaBlanco1=new Reina();
		ReinaBlanco1.SetColor("NEGRO");
		
		
		Rey ReyNegro1=new Rey();
		ReyNegro1.setColor("NEGRO");
		
		Rey ReyBlanco1 = new Rey();
		ReyBlanco1.setColor("BLANCO");
		
		Piezas ordenamiento[][] = new Piezas[8][8];
		ordenamiento[0][0]=TorreNegro1;
		ordenamiento[0][1]=CaballoNegro1;
		ordenamiento[0][2]=AlfilNegro1;
		ordenamiento[0][3]=ReyNegro1;
		ordenamiento[0][4]=ReinaNegro1;
		ordenamiento[0][5]=AlfilNegro2;
		ordenamiento[0][6]=CaballoNegro2;
		ordenamiento[0][7]=TorreNegro2;
		ordenamiento[1][0]=PeonNegro1;
		ordenamiento[1][1]=PeonNegro2;
		ordenamiento[1][2]=PeonNegro3;
		ordenamiento[1][3]=PeonNegro4;
		ordenamiento[1][4]=PeonNegro5;
		ordenamiento[1][5]=PeonNegro6;
		ordenamiento[1][6]=PeonNegro7;
		ordenamiento[1][7]=PeonNegro8;
		
		ordenamiento[6][0]=TorreBlanco1;
		ordenamiento[6][1]=CaballoBlanco1;
		ordenamiento[6][2]=AlfilBlanco1;
		ordenamiento[6][3]=ReyBlanco1;
		ordenamiento[6][4]=ReinaBlanco1;
		ordenamiento[6][5]=AlfilBlanco2;
		ordenamiento[6][6]=CaballoBlanco2;
		ordenamiento[6][7]=TorreBlanco2;
		ordenamiento[7][0]=PeonBlanco1;
		ordenamiento[7][1]=PeonBlanco2;
		ordenamiento[7][2]=PeonBlanco3;
		ordenamiento[7][3]=PeonBlanco4;
		ordenamiento[7][4]=PeonBlanco5;
		ordenamiento[7][5]=PeonBlanco6;
		ordenamiento[7][6]=PeonBlanco7;
		ordenamiento[7][7]=PeonBlanco8;
		
		
		
//		//Vector antes de ordenar
//				System.out.println("Empleados antes de ordenar");
//				System.out.println(Arrays.toString(ordenamiento));
//
//				//Aqui ordeno la lista
//				Arrays.sort(ordenamiento);
//				System.out.println("Empleados despues de ordenar");
//				System.out.println(Arrays.toString(ordenamiento));
				
				int Piezas[][] = new int [8][8];
				
				for (int fila = 0; fila <8; fila++) {
					for (int columna = 0; columna < 10; columna++) {
						if ( fila == columna) {
							Piezas[fila][columna] = 1;
							
						}else{
							Piezas[fila][columna] = 0;
							
						}
			           System.out.print(Piezas[fila][columna] + " ");
					}
					System.out.println();
				}
				}
			
		
		
		
		
		
		
		
		
		
		

	}

}
