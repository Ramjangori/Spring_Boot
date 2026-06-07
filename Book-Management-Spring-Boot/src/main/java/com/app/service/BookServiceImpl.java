package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Books;
import com.app.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepo;

	@Override
	public Books addBook(Books b) {

		return bookRepo.save(b);
	}

	@Override
	public void deleteBookById(int id) {

		bookRepo.deleteById(id);
	}

	@Override
	public List<Books> showAllBooks() {

		return bookRepo.findAll();
	}

	@Override
	public Books updateBook(int id, Books updateBook) {
		Books b = bookRepo.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
		b.setAuthor(updateBook.getAuthor());
		b.setName(updateBook.getName());
		b.setPrice(updateBook.getPrice());
		b.setPublication(updateBook.getPublication());

		return bookRepo.save(b);
	}

	@Override
	public Books getBookById(int id) {

		return bookRepo.findById(id).orElseThrow(() -> new RuntimeException("Book Not Found"));
	}

}
