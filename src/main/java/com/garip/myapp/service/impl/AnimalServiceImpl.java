package com.garip.myapp.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.garip.myapp.dao.IAnimalDao;
import com.garip.myapp.entities.Animal;
import com.garip.myapp.service.IAnimalService;

@Transactional(readOnly=true)
public class AnimalServiceImpl implements IAnimalService {
	
	private IAnimalDao animalDao;
	
	
	@Override
	@Transactional(readOnly=false)
	public Animal createAnimal(Animal animal) {
		return animalDao.createAnimal(animal);
	}
	

	/** Setter pour animalDao **/
	public void setAnimalDao(IAnimalDao animalDao) {
		this.animalDao = animalDao;
	}

}
