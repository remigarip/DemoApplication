package com.garip.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String typeAnimal;
	private int niveau;
	private boolean estInvite;
	private boolean requeteSpeciale;
	
	
	
	public Animal(String nom, String typeAnimal, int niveau, boolean estInvite, boolean requeteSpeciale) {
		super();
		this.nom = nom;
		this.typeAnimal = typeAnimal;
		this.niveau = niveau;
		this.estInvite = estInvite;
		this.requeteSpeciale = requeteSpeciale;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTypeAnimal() {
		return typeAnimal;
	}
	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public boolean isEstInvite() {
		return estInvite;
	}
	public void setEstInvite(boolean estInvite) {
		this.estInvite = estInvite;
	}
	public boolean isRequeteSpeciale() {
		return requeteSpeciale;
	}
	public void setRequeteSpeciale(boolean requeteSpeciale) {
		this.requeteSpeciale = requeteSpeciale;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", nom=" + nom + ", typeAnimal=" + typeAnimal + ", niveau=" + niveau
				+ ", estInvite=" + estInvite + ", requeteSpeciale=" + requeteSpeciale + "]";
	}
	
	


}
