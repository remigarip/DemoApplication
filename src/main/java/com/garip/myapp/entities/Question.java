package com.garip.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String intitulle;
	private String bonneReponse;
	private String mauvaiseReponse1;
	private String mauvaiseReponse2;
	private String mauvaiseReponse3;
	private String theme;
	private String langue;
		
	
	public Question() {
		
	}

	public Question(String intitulle, String bonneReponse, String mauvaiseReponse1, String mauvaiseReponse2,
			String mauvaiseReponse3, String theme, String langue) {
		super();
		this.intitulle = intitulle;
		this.bonneReponse = bonneReponse;
		this.mauvaiseReponse1 = mauvaiseReponse1;
		this.mauvaiseReponse2 = mauvaiseReponse2;
		this.mauvaiseReponse3 = mauvaiseReponse3;
		this.theme = theme;
		this.langue = langue;
	}


	/** Getters & Setters **/
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getIntitulle() {
		return intitulle;
	}


	public void setIntitulle(String intitulle) {
		this.intitulle = intitulle;
	}


	public String getBonneReponse() {
		return bonneReponse;
	}


	public void setBonneReponse(String bonneReponse) {
		this.bonneReponse = bonneReponse;
	}

	public String getMauvaiseReponse1() {
		return mauvaiseReponse1;
	}

	public void setMauvaiseReponse1(String mauvaiseReponse1) {
		this.mauvaiseReponse1 = mauvaiseReponse1;
	}

	public String getMauvaiseReponse2() {
		return mauvaiseReponse2;
	}

	public void setMauvaiseReponse2(String mauvaiseReponse2) {
		this.mauvaiseReponse2 = mauvaiseReponse2;
	}

	public String getMauvaiseReponse3() {
		return mauvaiseReponse3;
	}

	public void setMauvaiseReponse3(String mauvaiseReponse3) {
		this.mauvaiseReponse3 = mauvaiseReponse3;
	}

	public String getTheme() {
		return theme;
	}


	public void setTheme(String theme) {
		this.theme = theme;
	}


	public String getLangue() {
		return langue;
	}


	public void setLangue(String langue) {
		this.langue = langue;
	}
}
