package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
	@Id
	private ObjectId id;
	private String username;
	private String password;
	private Role role;
	private String facebookId;
	private String phone;
	private String address;
	private String firstName;
	private String lastName;
	private String email;
	private String avatarImg;
	
	
	public User() {
		this.facebookId = "...Not exist...";
		this.address = "...default adress...";
		this.email = "example@gmail.com";
		this.firstName = "...default firstName...";
		this.lastName = "...default LastName...";
		this.phone = "...default Phone...";
		this.avatarImg = "https://kenh14cdn.com/2017/screen-shot-2017-09-26-at-130303-1506405831707.png";
		
	}
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getFacebookId() {
		return facebookId;
	}
	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAvatarImg() {
		return avatarImg;
	}
	public void setAvatarImg(String avatarImg) {
		this.avatarImg = avatarImg;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", facebookId=" + facebookId + ", phone=" + phone + ", address=" + address + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", avatarImg=" + avatarImg + "]";
	}
	
}
