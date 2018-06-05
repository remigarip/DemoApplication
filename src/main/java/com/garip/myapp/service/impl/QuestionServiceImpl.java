package com.garip.myapp.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.garip.myapp.dao.IQuestionDao;
import com.garip.myapp.entities.Question;
import com.garip.myapp.service.IQuestionService;

@Transactional(readOnly=true)
public class QuestionServiceImpl implements IQuestionService {
	
	private IQuestionDao questionDao;

	@Override
	@Transactional(readOnly=false)
	public Question createQuestion(Question question) {
		return questionDao.createQuestion(question);
	}

	@Override
	@Transactional(readOnly=false)
	public void deleteQuestion(Question question) {
		questionDao.deleteQuestion(question);
	}

	@Override
	@Transactional(readOnly=false)
	public Question updateQuestion(Question question) {
		return questionDao.updateQuestion(question);
	}

	@Override
	public Question getQuestionById(int idQuestion) {
		return questionDao.getQuestionById(idQuestion);
	}

	@Override
	public List<Question> getAllQuestion() {
		return questionDao.getAllQuestion();
	}

	@Override
	public List<Question> getAllQuestionByTheme(String theme) {
		return questionDao.getAllQuestionByTheme(theme);
	}
	
	/** Setter du Dao **/
	public void setQuestionDao(IQuestionDao questionDao) {
		this.questionDao = questionDao;
	}
	
	

}
