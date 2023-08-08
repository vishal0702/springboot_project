package com.api.book.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.dao.BookRepository;
import com.api.book.entities.Book;

@Component
public class BookService {

	@Autowired
	private BookRepository bookRepository;

//	private static List<Book> list = new ArrayList<Book>();
//
//	static {
//		list.add(new Book(101, "Book1", "Author1"));
//		list.add(new Book(102, "Book2", "Author2"));
//		list.add(new Book(103, "Book3", "Author3"));
//	}

	// Get all books-> GetMapping
	public List<Book> getAllBooks() {

		List<Book> list = (List<Book>) this.bookRepository.findAll();
		return list;
	}

	// Get single book by id-> GetMapping
	public Book getBookById(int id) {
		Book book = null;
		try {
			// book = list.stream().filter(e -> e.getId() == id).findFirst().get();
			book = this.bookRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	// Adding the book-> PostMapping
	public Book addBook(Book b) {
		Book result = this.bookRepository.save(b);
		return result;
	}

	// Delete book
	public void deleteBook(int bookId) {
		// Update the existing list with the book details whose Id is not matching with
		// bookId which has be deleted
		// list = list.stream().filter(book -> book.getId() !=
		// bookId).collect(Collectors.toList());

		this.bookRepository.deleteById(bookId);
	}

	// Update book
	public void updateBook(Book book, int bookId) {
//		list= list.stream().map(b->{
//			if(b.getId()==bookId) {
//				b.setAuthor(book.getAuthor());
//				b.setTitle(book.getTitle());
//			}
//			return b;
//		}).collect(Collectors.toList());
		book.setId(bookId);
		this.bookRepository.save(book);
	}
}
