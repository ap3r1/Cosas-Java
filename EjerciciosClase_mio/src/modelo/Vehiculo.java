package modelo;

public class Vehiculo {
	
	//Los vehiculos vienen en forma de cadena, con su id, marca, modelo y precio
	// int, String , String y float
	
	private int id;
	private String marca;
	private String modelo;
	private float precio;
	
	public Vehiculo(int id, String marca, String modelo, float precio) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
