package com.garip.myapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.garip.myapp.dao.impl.PersonneDaoImpl;
import com.garip.myapp.entities.Personne;
import com.garip.myapp.service.IPersonneService;

@Transactional(readOnly = true)
public class PersonneServiceImpl implements IPersonneService{
	
	@Autowired
	private PersonneDaoImpl personneDao;

	@Override
	@Transactional(readOnly=false)
	public Personne createPersonne(Personne personne) {
		return personneDao.createPersonne(personne);
	}

	@Override
	public Personne findPersonneById(long idPersonne) {
		return personneDao.findPersonneById(idPersonne);
	}

	@Override
	public List<Personne> findPersonneByNomPrenom(String nom, String prenom) {
		return personneDao.findPersonneByNomPrenom(nom, prenom);
	}

	@Override
	public List<Personne> findAllPersonne() {		
		return personneDao.findAllPersonne();
	}

	@Override
	@Transactional(readOnly=false)
	public void deletePersonne(Personne personne) {
		personneDao.deletePersonne(personne);
		
	}

	@Override
	@Transactional(readOnly=false)
	public Personne updatePersonne(Personne personne) {
		return personneDao.updatePersonne(personne);
	}
	
	/** Setter pour personneDao **/
	public void setPersonneDao(PersonneDaoImpl personneDao) {
		this.personneDao = personneDao;
	}
}
