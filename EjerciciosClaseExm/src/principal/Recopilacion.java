package principal;
import java.util.Random;
import modelo.Libro;

public class Recopilacion {
	/*
	 * PARSEAR DATOS
	 */

	void parseoDatos () {
		
		int numero = 0 ;
		String palabra = "" ;
		double num_decimal = 0.0;
		
		palabra = Integer.toString(numero); //int a string
		palabra = Double.toString(num_decimal); //double a string
		numero = Integer.parseInt(palabra); //string a int
		num_decimal = Double.parseDouble(palabra); // String a double
		numero = (int) num_decimal; //parte entera del double
		num_decimal = (double) numero; //pasa int a double
	
	}
	
	void constructores () {
		int numero = 0 ;
		String palabra = "" ;
		double num_decimal = 0.0;
		boolean boleano = true;
		char letra = 'L';
		
		Libro miLibro = new Libro(); //nuevo Libro
		Libro arrayLibros[] = new Libro[numero];
		Libro matrizLibros[][] = new Libro[numero][numero];
		
		String array[] = new String[numero];
		String matriz[][] = new String[numero][numero];
		
		/* Metodos de String */
		
		 String array2[] = palabra.split("-"); // "hola-mundo" => {"hola", "mundo"}
		 String recorte = palabra.substring(4, 9); // "holamundo" => "mundo"
		 char letra2 = palabra.charAt(4); // "holamundo" => 'm'
		 int posicion = palabra.indexOf("mundo"); // "holamundo" => 4
		 int comparacion = palabra.compareTo("b"); 
		 // "a" vs "b" => mayor que 0 
		 // "b" vs "a" => menor que 0
		 // "a" vs "a" => igual 0
		 int tamaño = palabra.length(); // Te da el tamaño
		 
		 
		 /* Numeros aleatorios */
		 
		 Random generador = new Random(); // Necesario: import java.util.Random;
		 int num_max = 6;
		 int num_min = 1;
		 
		 int aleatorio = (int) Math.random() * (num_max - num_min) + num_min; // Del 1 al 6
		 aleatorio = generador.nextInt(num_max - num_min + 1) + num_min; // Del 1 al 6 
	}
	

	

}
