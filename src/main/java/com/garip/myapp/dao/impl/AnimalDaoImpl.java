package com.garip.myapp.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.garip.myapp.dao.IAnimalDao;
import com.garip.myapp.entities.Animal;

public class AnimalDaoImpl implements IAnimalDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Animal createAnimal(Animal animal) {
		entityManager.persist(animal);
		return animal;
	}

	
	
}
