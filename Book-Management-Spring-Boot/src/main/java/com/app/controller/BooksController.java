package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Books;
import com.app.service.BookService;

@RestController
@RequestMapping("/books")
public class BooksController {

	@Autowired
	private BookService bookService;

	@GetMapping("/show")
	public List<Books> showAllBooks() {

		return bookService.showAllBooks();
	}

	@GetMapping("/{id}")
	public Books getBookById(@PathVariable("id") int id) {

		return bookService.getBookById(id);
	}

	@PostMapping("add")
	public Books addBook(@RequestBody Books b) {

		return bookService.addBook(b);
	}

	@PutMapping("update/{id}")
	public String deleteBook(@RequestBody Books b, @PathVariable int id) {
		bookService.updateBook(id, b);

		return "Book updated   Seccessfully";
	}
		
		@DeleteMapping("delete/{id}")
		public String deleteBook(@PathVariable("id") int id) {
			
			bookService.deleteBookById(id);
			
			return "Book Delete Sucessfully";
		}

	
}
