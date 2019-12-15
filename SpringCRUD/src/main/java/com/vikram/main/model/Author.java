package com.vikram.main.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Author 
{
	 @Id
	 @GeneratedValue
	 private Long id;
	 
	 private String firstname;
	 private String lastname;
	 private String email;
	 
	 @OneToMany(mappedBy ="author")
	 private List<Book> books;
	 private Author()
	 {
		 
	 }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Author(Long id, String firstname, String lastname, String email, List<Book> books) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.books = books;
	}
} 
