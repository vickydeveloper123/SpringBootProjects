package com.example.demo.dto.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import com.example.demo.dto.responsedto.AuthorResponseDTO;
import com.example.demo.dto.responsedto.BookResponseDTO;
import com.example.demo.dto.responsedto.CateogoryResponseDTO;
import com.example.demo.relationship.mode.Author;
import com.example.demo.relationship.mode.Book;
import com.example.demo.relationship.mode.Cateogory;

public class mapper {
	
	
	 public static BookResponseDTO bookToBookResponseDto(Book book) {
		 BookResponseDTO bookResponseDto = new BookResponseDTO();
	        bookResponseDto.setId(book.getId());
	        bookResponseDto.setCateogoryName(book.getCateogory().getName());
	        List<String> names = new ArrayList<>();
	        List<Author> authors = book.getAuthors();
	        for (Author author: authors) {
	            names.add(author.getName());
	        }
	        bookResponseDto.setAuthorNames(names);
	        return bookResponseDto;
	    }
	 
	 



	    public static List<BookResponseDTO> booksToBookResponseDtos(List<Book> books) {
	        List<BookResponseDTO> bookResponseDtos = new ArrayList<>();
	        for (Book book: books) {
	            bookResponseDtos.add(bookToBookResponseDto(book));
	        }
	        return bookResponseDtos;
	    }

	    public static AuthorResponseDTO authorToAuthorResponseDto(Author author) {
	    	AuthorResponseDTO authorResponseDto = new AuthorResponseDTO();
	        authorResponseDto.setId(author.getId());
	        authorResponseDto.setName(author.getName());
	        List<String> names = new ArrayList<>();
	        List<Book> books = author.getBooks();
	        for (Book book: books) {
	            names.add(book.getName());
	        }
	        authorResponseDto.setBookNames(names);
	        return authorResponseDto;
	    }

	    public static List<AuthorResponseDTO> authorsToAuthorResponseDtos(List<Author> authors){
	        List<AuthorResponseDTO> authorResponseDtos = new ArrayList<>();
	        for (Author author: authors) {
	            authorResponseDtos.add(authorToAuthorResponseDto(author));
	        }
	        return authorResponseDtos;
	    }

	    public static CateogoryResponseDTO categoryToCategoryResponseDto(Cateogory category) {
	    	CateogoryResponseDTO categoryResponseDto = new CateogoryResponseDTO();
	        categoryResponseDto.setId(category.getId());
	        categoryResponseDto.setName(category.getName());
	        List<String> names = new ArrayList<>();
	        List<Book> books = category.getBooks();
	        for (Book book : books) {
	            names.add(book.getName());
	        }
	        categoryResponseDto.setNames(names);
	        return categoryResponseDto;
	    }

	    public static List<CateogoryResponseDTO> categoriesToCategoryResponseDtos(List<Cateogory> categories) {
	        List<CateogoryResponseDTO> categoryResponseDtos = new ArrayList<>();
	        for (Cateogory category: categories) {
	            categoryResponseDtos.add(categoryToCategoryResponseDto(category));
	        }
	        return categoryResponseDtos;
	    }

}
