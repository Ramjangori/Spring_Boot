package com.app.service;

import java.util.List;

import com.app.entity.Books;

public interface BookService {
  
	public Books addBook(Books b);
	public void deleteBookById(int id);
	public List<Books> showAllBooks();
	public Books updateBook(int id , Books updateBook);
	public Books getBookById(int id);
}