package com.garip.myapp.dao;

import java.util.List;

import com.garip.myapp.entities.Personne;

public interface IPersonneDao {
	
	Personne createPersonne(Personne personne);
	
	Personne findPersonneById(long idPersonne);
	
	List<Personne> findPersonneByNomPrenom(String nom, String prenom);
	
	List<Personne> findAllPersonne();
	
	void deletePersonne(Personne personne);
	
	Personne updatePersonne(Personne personne);
;
}
