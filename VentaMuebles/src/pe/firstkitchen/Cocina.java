package pe.firstkitchen;


public class Cocina {
	
	private String modelo;
	private double precio;
	private double ancho;
	private double alto;
	private double fondo;
	private int quemadores;
	
	public Cocina(String modelo, double precio, double ancho, double alto, double fondo, int quemadores) {
		super();
		this.modelo = modelo;
		this.precio = precio;
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.quemadores = quemadores;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getFondo() {
		return fondo;
	}

	public void setFondo(double fondo) {
		this.fondo = fondo;
	}

	public int getQuemadores() {
		return quemadores;
	}

	public void setQuemadores(int quemadores) {
		this.quemadores = quemadores;
	}

	
	
}
