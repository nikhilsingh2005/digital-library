package com.ajackus.digital_library.service;

import com.ajackus.digital_library.dto.BookDTO;
import com.ajackus.digital_library.model.Book;

import java.util.List;

public interface BookService {

    Book addBook(BookDTO bookDTO);

    List<Book> getAllBooks();

    Book getBookById(String bookId);

    List<Book> searchBooksByTitle(String title);

    Book updateBook(String bookId, BookDTO bookDTO);

    void deleteBook(String bookId);
}
