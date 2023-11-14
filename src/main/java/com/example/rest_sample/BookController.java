package com.example.rest_sample;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	private final BookMapper bookMapper;

	public BookController(BookMapper bookMapper, AuthorMapper authorMapper) {
		this.bookMapper = bookMapper;
	}


	@GetMapping("/book/{id}")
	public Book bookById(@PathVariable(value = "id") Integer id) {
		return bookMapper.getById(id);
	}

	@GetMapping("/book_all")
	public List<Book> bookAll() {
		System.out.println("ccc");
		return bookMapper.findAll();
	}

	@GetMapping("/book_all_with_authors")
	public List<Book> bookAllWithAuthors() {
		return bookMapper.findWithAuthors();
	}

}