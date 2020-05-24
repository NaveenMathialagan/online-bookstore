package com.smntech.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smntech.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
