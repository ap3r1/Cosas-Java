package examen;

import auxiliar.Practicas;
import modelo.Vehiculo;

public class Metodos {
	Practicas practicas = new Practicas();

	// ejercicio 1
	public boolean[] metodo1(String[]  nifs) {
		boolean arrayNif[] = new boolean[nifs.length];
		for (int i = 0; i < nifs.length; i++) {
		arrayNif[i] = (practicas.validarNif(nifs[i]));
			System.out.println(arrayNif[i]);
		}
		return arrayNif;
		
	}

	// ejercicio 2
	
	 public Vehiculo[] metodo2 (String[] vehiculos) {
		 String[] cocheaux;
		 Vehiculo[] coches = new Vehiculo[4];
		 for (int i = 0; i < vehiculos.length; i++) {
			cocheaux = vehiculos[i].split("@");
			//System.out.println(cocheaux[0] + ""+ cocheaux[1] + "" + cocheaux[2] + "" + cocheaux[3] );

			try {
				Vehiculo car = new Vehiculo(Integer.parseInt(cocheaux[0]), cocheaux[1], cocheaux[2], Float.parseFloat(cocheaux[3]));
				//pasar a int, string, string, float
				coches[i] = car;
			} catch (NumberFormatException e) {
				coches[i] = null;
			}
		}
		
		return coches;
		 
		 
	 }
	
	 // ejercicio 3
	 public int[][] metodo3(int partidas, int jugadores){
		 int[][] juego = new int [partidas] [jugadores];
		 for (int i = 0; i < partidas; i++) {
			for (int j = 0; j < jugadores; j++) {
				juego [i][j] = (int)(Math.random()*6)+1;
				System.out.print(""+juego[i][j]);
			}
		}
		return juego;
		
//		public int[][] jugarDados(int jugadores, int partidas) {
//			int[][] juego = new int[jugadores][partidas];
//			for (int i = 0; i < partidas ; i++) {
//				for (int j = 0; j < jugadores ; j++) {
//					juego[j][i] = (int)(Math.random()*6)+1;
//				}
//			}
		 
	 }

	
		

	
}
