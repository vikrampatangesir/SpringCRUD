package com.vikram.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.vikram.main.model.Author;
import com.vikram.main.model.Book;

public interface AuthorRepository extends CrudRepository<Author, Long> 
{
      
}
