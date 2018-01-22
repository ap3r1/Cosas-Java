package modelo;

public class Venta {

	private String id;
	private String Fecha;
	private float cantidad;
	
	public String getId() {
		return id;
	}
	public Venta(String id, String fecha, Integer cantidad) {
		this.id = id;
		Fecha = fecha;
		this.cantidad = cantidad;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
