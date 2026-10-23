package net.kdcar15.desupro.model.gestion;

public class Especie{
	private String nombre;
	private Raza raza;
	
	public Especie(	String nombre,
					Raza raza) {
		this.nombre = nombre;
		this.raza = raza;
	}
	
	// Getter y setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Raza getRaza() {
		return raza;
	}
	public void setRaza(Raza raza) {
		this.raza = raza;
	}
}
