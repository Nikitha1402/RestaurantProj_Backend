package com.example.demo.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_detail")
public class CcprojEntity {
	@Id
			

	@Column(name="fullName")
	private String fullName;
	
@Column(name="lastName")
private String lastName;
@Column(name="email")
private String email;
@Column(name="password")
private String password;
public CcprojEntity(String fullName, String lastName, String email, String password) {
	super();
	this.fullName = fullName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public CcprojEntity() {
}
}
