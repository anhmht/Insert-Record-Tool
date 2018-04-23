package com.example.demo.model;

import org.bson.types.ObjectId;

public class Language {
	private ObjectId id;
	private String key;
	private String english;
	private String vietnamese;
	
	public Language() {
		// TODO Auto-generated constructor stub
	}
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}

	public String getVietnamese() {
		return vietnamese;
	}
	public void setVietnamese(String vietnamese) {
		this.vietnamese = vietnamese;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
}
