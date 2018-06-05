package com.garip.myapp;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.garip.myapp.entities.Question;
import com.garip.myapp.service.IQuestionService;

public class QuestionServiceTest {
	
	private  static IQuestionService questionService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Début du Test");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		questionService = (IQuestionService) context.getBean("questionService");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Fin du Test");
	}

	@Test
	public void testCreateQuestion() {
		Question question = new Question();
		question.setIntitulle("Quelle est la couleur du cheval blanc d'Henri IV ?");
		question.setBonneReponse("Blanc");
		question.setMauvaiseReponse1("vert");
		question.setMauvaiseReponse2("noir");
		question.setMauvaiseReponse3("rouge");
		question.setTheme("Miscellaneous");
		question.setLangue("FR");
		
		question = questionService.createQuestion(question);
		assertTrue(question.getId() >0 );
	}

}
