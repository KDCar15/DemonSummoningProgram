package net.kdcar15.desupro.model.usuarios;

import net.kdcar15.desupro.model.gestion.Especie;

public class Demonio {
	private Especie especie;
	private Cliente owner;
	
	public Demonio(	Especie especie,
					Cliente owner) {
		this.especie = especie;
		this.owner = owner;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public Cliente getOwner() {
		return owner;
	}

	public void setOwner(Cliente owner) {
		this.owner = owner;
	}
}
