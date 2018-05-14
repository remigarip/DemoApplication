package com.garip.myapp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.garip.myapp.dao.IPersonneDao;
import com.garip.myapp.entities.Personne;


public class PersonneDaoImpl implements IPersonneDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Personne createPersonne(Personne personne) {
		System.out.println("Coucou1");
		entityManager.persist(personne);
		System.out.println("Coucou2");
		return personne;
	}

	@Override
	public Personne findPersonneById(long idPersonne) {
		Personne personne = entityManager.find(Personne.class, idPersonne);
		return personne;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Personne> findPersonneByNomPrenom(String nom, String prenom) {
		Query query = entityManager.createQuery("from Personne where nom like ? and prenom like ?", Personne.class);
		query.setParameter(1, nom);
		query.setParameter(2, prenom);
		return query.getResultList();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Personne> findAllPersonne() {
		Query query = entityManager.createQuery("from Personne", Personne.class);
		return query.getResultList();
	}

	@Override
	public void deletePersonne(Personne personne) {
		entityManager.remove(personne);
		
	}

	@Override
	public Personne updatePersonne(Personne personne) {
		entityManager.merge(personne);
		return personne;
	}

}
