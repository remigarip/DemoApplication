package com.garip.myapp;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.garip.myapp.entities.Personne;
import com.garip.myapp.service.IPersonneService;

public class PersonneServiceTest {
	
	private static IPersonneService personneService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Début du Test");
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("app.xml");
		personneService = (IPersonneService) context.getBean("personneService");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Fin du Test");
		
	}

	@Test
	public void testCreatePersonne() {
		Personne personne = new Personne();
		personne.setNom("Doe");
		personne.setPrenom("John");
		personne.setDateNaissance(new Date());
		personne = personneService.createPersonne(personne);
	}
	
	@Ignore
	@Test
	public void testFindPersonneById() {
		fail("Not yet implemented");
	}
	
	@Ignore
	@Test
	public void testFindPersonneByNomPrenom() {
		fail("Not yet implemented");
	}
	
	@Ignore
	@Test
	public void testFindAllPersonne() {
		fail("Not yet implemented");
	}
	
	@Ignore
	@Test
	public void testDeletePersonne() {
		fail("Not yet implemented");
	}
	
	@Ignore
	@Test
	public void testUpdatePersonne() {
		fail("Not yet implemented");
	}
	
}
