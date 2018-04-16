package com.example.demo.model;

import java.util.ArrayList;

import org.bson.types.ObjectId;

public class Language {
	private ObjectId id;
	private String english;
	private String japanese;
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
	public String getJapanese() {
		return japanese;
	}
	public void setJapanese(String japanese) {
		this.japanese = japanese;
	}
	public String getVietnamese() {
		return vietnamese;
	}
	public void setVietnamese(String vietnamese) {
		this.vietnamese = vietnamese;
	}
	
	
}
