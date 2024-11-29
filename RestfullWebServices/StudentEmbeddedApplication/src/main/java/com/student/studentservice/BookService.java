package com.student.studentservice;

import java.util.List;

import com.student.entity.Book;

public interface BookService {

	public List<Book> insertingBooks(Book book);

	public List<Book> getAllBooks();

	public List<Book> getBookById(Integer bookId);

	public List<Book> getBookName(String bookName);

	public List<Book> updateBook(Book book, String bookId);

	public List<Book> deleteBook();
}
