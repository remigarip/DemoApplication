package com.garip.myapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.garip.myapp.entities.Question;
import com.garip.myapp.service.IQuestionService;

@Component("questionBean")
@Scope(value="session")
public class QuestionController {
	
	@Inject
	private IQuestionService questionService;
	
	private String intituleQuestion = "Question";
	private String reponse1= "Reponse 1";
	private String reponse2= "Reponse 2";
	private String reponse3= "Reponse 3";
	private String reponse4= "Reponse 4";


	public void lancerQuizz() {
		List<Question> questions = new ArrayList<Question>();
		questions = questionService.getAllQuestion();
		if (questions.size()>0) {
			Collections.shuffle(questions);
			Question question = questions.get(0);
			intituleQuestion = question.getIntitulle();
			reponse1 = question.getBonneReponse();
			reponse2 = question.getMauvaiseReponse1();
			reponse3 = question.getMauvaiseReponse2();
			reponse4 = question.getMauvaiseReponse3();
		}
	}

	/** Getters & Setters **/
	public IQuestionService getQuestionService() {
		return questionService;
	}


	public void setQuestionService(IQuestionService questionService) {
		this.questionService = questionService;
	}


	public String getIntituleQuestion() {
		return intituleQuestion;
	}


	public void setIntituleQuestion(String intituleQuestion) {
		this.intituleQuestion = intituleQuestion;
	}


	public String getReponse1() {
		return reponse1;
	}


	public void setReponse1(String reponse1) {
		this.reponse1 = reponse1;
	}


	public String getReponse2() {
		return reponse2;
	}


	public void setReponse2(String reponse2) {
		this.reponse2 = reponse2;
	}


	public String getReponse3() {
		return reponse3;
	}


	public void setReponse3(String reponse3) {
		this.reponse3 = reponse3;
	}


	public String getReponse4() {
		return reponse4;
	}


	public void setReponse4(String reponse4) {
		this.reponse4 = reponse4;
	}
	
	
}
