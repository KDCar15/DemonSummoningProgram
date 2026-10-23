package net.kdcar15.desupro.model.gestion;

public class Species{
	private String name;
	private Race race;
	
	public Species(	String name,
					Race race) {
		this.name = name;
		this.race = race;
	}
	
	// Getter y setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Race getRace() {
		return race;
	}
	public void setRace(Race race) {
		this.race = race;
	}
}
