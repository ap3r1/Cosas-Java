package modelo;

import java.util.Date;

public class Persona2  {

	private String nif;
	@Override
	public String toString() {
		return nif;
	}

	private String nombre;
	private char sexo;
	private int fecha;

	public Persona2(String nif, String nombre, char sexo, int fecha) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.sexo = sexo;
		this.fecha = fecha;
	}

	public Persona2() {
		super();
		this.nif = "123456789K";
		this.nombre = "anonimo";
		this.sexo = 'M';
		this.fecha = 20000101;
		// TODO Auto-generated constructor stub
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public String getNif() {
		return nif;
	}

	public String getNombre() {
		return nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public int getFecha() {
		return fecha;
	}

	

	
	
	
}
