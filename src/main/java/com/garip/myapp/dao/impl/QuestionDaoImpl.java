package com.garip.myapp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.garip.myapp.dao.IQuestionDao;
import com.garip.myapp.entities.Question;

public class QuestionDaoImpl implements IQuestionDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Question createQuestion(Question question) {
		entityManager.persist(question);
		return question;
	}

	@Override
	public void deleteQuestion(Question question) {
		entityManager.remove(question);
	}

	@Override
	public Question updateQuestion(Question question) {
		entityManager.merge(question);
		return question;
	}

	@Override
	public Question getQuestionById(int idQuestion) {
		Query query = entityManager.createQuery("from Question where id = ?");
		query.setParameter(0, idQuestion);
		return (Question) query.getSingleResult();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Question> getAllQuestion() {
		Query query = entityManager.createQuery("from Question");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Question> getAllQuestionByTheme(String theme) {
		Query query = entityManager.createQuery("from Question where theme like ?");
		query.setParameter(0, theme);
		return query.getResultList();
	}

}
