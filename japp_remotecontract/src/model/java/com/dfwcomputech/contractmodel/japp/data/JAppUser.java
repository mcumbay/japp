package com.dfwcomputech.contractmodel.japp.data;

import javax.xml.bind.annotation.XmlType;

/**
 * User Model Class
 * No getter/setters needed
 * @autor mcumbay
 */
@XmlType(propOrder = {})
public class JAppUser {
	private String userName;
	private String password;
	private String name;
	private String lastName;
	private String email;
	private String phone;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
