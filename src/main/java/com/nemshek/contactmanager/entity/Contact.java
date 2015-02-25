/**
 * copyright Nemshek Software Solution
 */
package com.nemshek.contactmanager.entity;

import java.util.List;

/**
 * @author nemshek
 *
 */
public class Contact {
	private String name;
	private String surname;
	private String email;
	private List<String> phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
}
