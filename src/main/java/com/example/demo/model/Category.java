package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Category {
	@Id
	private ObjectId id;
	private String category_name;
	private Category category_parent;
	
	public Category() {
		Language language = new Language();
		language.setEnglish("");
		
	}
	
	public  ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	

	public Category getCategory_parent() {
		return category_parent;
	}

	public void setCategory_parent(Category category_parent) {
		this.category_parent = category_parent;
	}
	
}
