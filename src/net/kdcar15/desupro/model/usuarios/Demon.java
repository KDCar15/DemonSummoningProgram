package net.kdcar15.desupro.model.usuarios;
import net.kdcar15.desupro.model.gestion.Species;

public class Demon {
	private Species species;
	private Client owner;
	
	public Demon(	Species species,
					Client owner) {
		this.species = species;
		this.owner = owner;
	}

	public Species getSpecies() {
		return species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}

	public Client getOwner() {
		return owner;
	}

	public void setOwner(Client owner) {
		this.owner = owner;
	}
}
