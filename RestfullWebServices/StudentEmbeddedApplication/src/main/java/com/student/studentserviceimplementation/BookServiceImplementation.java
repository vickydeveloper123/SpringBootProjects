package com.student.studentserviceimplementation;

import java.util.List;
import java.util.Optional;

import com.student.entity.Book;
import com.student.repository.BookRepository;
import com.student.studentservice.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImplementation implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> insertingBooks(Book book) {
        bookRepository.save(book);
        return bookRepository.findAll();
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> getBookById(Integer bookId) {
        Optional<Book> book = bookRepository.findById(bookId);
        return book.isPresent() ? List.of(book.get()) : List.of();
    }

    @Override
    public List<Book> getBookName(String bookName) {
        return bookRepository.findByBookName(bookName);
    }

    @Override
    public List<Book> updateBook(Book book, String bookId) {
        Optional<Book> existingBook = bookRepository.findById(Integer.parseInt(bookId));
        if (existingBook.isPresent()) {
            Book updatedBook = existingBook.get();
            updatedBook.setBookName(book.getBookName());
            updatedBook.setBookAuthor(book.getBookAuthor());
            updatedBook.setBookPublishedDate(book.getBookPublishedDate());
            bookRepository.save(updatedBook);
            return List.of(updatedBook);
        } else {
            return List.of();
        }
    }

    @Override
    public List<Book> deleteBook() {
        // Implement deletion logic if needed
        // For example, deleting all books:
        bookRepository.deleteAll();
        return bookRepository.findAll();
    }
}
