package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	List<Book> findByBookName(String bookName);

}
