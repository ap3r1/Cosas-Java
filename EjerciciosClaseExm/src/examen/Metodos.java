package examen;

import modelo.Libro;

public class Metodos {

	// ejercicio 1
	public char dameLetraNif(int numero) {
		char[] letrasValidas = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };
		// String dni=Integer.toString(numero);//convierto de int a string
		String dni = numero + "";
		if (dni.length() != 8) {
			return '1';

		}
		int modulo = numero % 23;
		return letrasValidas[modulo];

	}

	// ejercicio 2
	public Libro[] creaArrayLibro(String[] libros) {
		String[] libroaux;
		Libro[] librosfinales = new Libro[4];
		for (int i = 0; i < libros.length; i++) {
			libroaux = libros[i].split("#");
			// System.out.println(libroaux[0]+ " "+ libroaux[1]+ " "+ libroaux[2]);//aqui
			// veo lo que guardo en el array

			try {
				Libro milibro = new Libro(Integer.parseInt(libroaux[0]), libroaux[1], Float.parseFloat(libroaux[2]));
				librosfinales[i] = milibro;
			} catch (NumberFormatException e) {
				librosfinales[i] = null;
			}
		}
		// Libro milibro=new Libro( id, titulo, pvp);
		return librosfinales;

	}

	// ejercicio 3
	public int[][] jugarDados(int jugadores, int partidas) {
		int[][] juego = new int[jugadores][partidas];
		for (int i = 0; i < partidas ; i++) {
			for (int j = 0; j < jugadores ; j++) {
				juego[j][i] = (int)(Math.random()*6)+1;
			}
		}
		
		return juego;

	}
	public void test () {
		int[]contadores = {0,0,0,0,0,0};
		for (int i = 0; i < 100; i++) {
		int numero=(int)(Math.random()*6)+1;
		contadores[numero-1] += 1;
		}
		for (int i = 0; i < contadores.length; i++) {
			System.out.println("Numero " + (i+1) + " = " + contadores[i]);
		}

		
	}

}
