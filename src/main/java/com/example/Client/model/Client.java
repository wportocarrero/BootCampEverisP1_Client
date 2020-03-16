package com.example.Client.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document( collection = "Client")
public class Client {
	@Id
	private String Doc;
	private String Name;
	private String LastName;
	private String Phone;
	public String getDoc() {
		return Doc;
	}
	public void setDoc(String doc) {
		Doc = doc;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
	
}
