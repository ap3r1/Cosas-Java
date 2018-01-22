package modelo;

public class Libro {
	private int id;
	private String titulo;
	private float pvp;
	
	public Libro() {
		
	}

	public Libro( int id, String titulo, float pvp) {
	this.id=id;
	this.titulo=titulo;
	this.pvp=pvp;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public float getPvp() {
		return pvp;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setPvp(float pvp) {
		this.pvp = pvp;
	}

}
