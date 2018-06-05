package com.garip.myapp;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.garip.myapp.entities.Animal;
import com.garip.myapp.service.IAnimalService;

@Component("animalBean")
@Scope(value="session")
public class AnimalController {
	@Inject
	private IAnimalService animalService;
	
	private String essai = "Hello world!";
	private String nomAnimal = "";
	private int niveauAnimal;

	public void createAnimal() {
		Animal animalACreer = new Animal(nomAnimal, "Ours", niveauAnimal, true, true);
		try {
			animalACreer = animalService.createAnimal(animalACreer);
			essai = animalACreer.getNom()  + " a été créé avec succès!";
		}
		catch (Exception e) {
			System.out.println("Une erreur est survenue.");
			essai = "Une erreur est survenue.";
			e.printStackTrace();
		}
	}
	
	
	
	public AnimalController() {
		this.essai = "";
	}



	/** Getters & Setters **/
	public String getEssai() {
		return essai;
	}
	
	public void setEssai(String essai) {
		this.essai = essai;
	}

	public String getNomAnimal() {
		return nomAnimal;
	}

	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}

	public int getNiveauAnimal() {
		return niveauAnimal;
	}

	public void setNiveauAnimal(int niveauAnimal) {
		this.niveauAnimal = niveauAnimal;
	}	
	
	
}
