package net.kdcar15.JDBCTest.model;

public class Cliente {
	private String nombres;
	private String apellidos;
	private String telefono;
	
	public Cliente(	String nombres,
					String apellidos,
					String telefono) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
