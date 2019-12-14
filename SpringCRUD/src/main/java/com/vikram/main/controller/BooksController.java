package com.vikram.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vikram.main.model.Book;
import com.vikram.main.repository.BooksRepository;

@RestController
@RequestMapping("/books")
public class BooksController 
{
	
	
	@Autowired
	BooksRepository  bookRepo;
	
	@GetMapping("/")
	public List<Book> listBooks()
	{
		return (List<Book>) bookRepo.findAll();
		
	}
	
	
	
	
	
	//add a book
	
	@RequestMapping(value ="/",method=RequestMethod.POST,consumes={"application/json"})
	public Book Create(@RequestBody Book book)
	{
		  Book newBook=new Book(null, "five point someone","Chetan Bhagat", null);
		  return bookRepo.save(book);
		  
		 
	}

	
}
