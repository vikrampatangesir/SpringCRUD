package com.vikram.main.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Book 
{
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	
	@ManyToOne
	private  Author author;
	private Double price;
	
	@ElementCollection
	private List<String> tags;
	
	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	private Book()
	{
		  
	}
	
	public Book(Long id, String title, Author author, Double price)
	{
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
