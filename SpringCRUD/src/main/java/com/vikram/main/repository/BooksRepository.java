package com.vikram.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.main.model.Book;

public interface BooksRepository extends JpaRepository<Book, Long>
{

}
