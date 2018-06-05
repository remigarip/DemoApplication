package com.garip.myapp.service;

import java.util.List;

import com.garip.myapp.entities.Question;

public interface IQuestionService {
	
	Question createQuestion(Question question);
	
	void deleteQuestion(Question question);
	
	Question updateQuestion(Question question);
	
	Question getQuestionById(int idQuestion);
	
	List<Question> getAllQuestion();
	
	List<Question> getAllQuestionByTheme(String theme);

}
