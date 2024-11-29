package com.student.controller;

import java.util.List;

import com.student.entity.Book;
import com.student.studentservice.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<List<Book>> insertBook(@RequestBody Book book) {
        List<Book> books = bookService.insertingBooks(book);
        return ResponseEntity.ok(books);
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Book>> getBookById(@PathVariable Integer id) {
        List<Book> books = bookService.getBookById(id);
        if (books.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(books);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Book>> getBookByName(@RequestParam String name) {
        List<Book> books = bookService.getBookName(name);
        return ResponseEntity.ok(books);
    }

    @PutMapping("/{id}")
    public ResponseEntity<List<Book>> updateBook(@PathVariable Integer id, @RequestBody Book book) {
        List<Book> books = bookService.updateBook(book, id.toString());
        if (books.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(books);
    }

    @DeleteMapping
    public ResponseEntity<List<Book>> deleteAllBooks() {
        List<Book> books = bookService.deleteBook();
        return ResponseEntity.ok(books);
    }
}
