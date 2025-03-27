package com.ajackus.digital_library.service;

import com.ajackus.digital_library.dto.BookDTO;
import com.ajackus.digital_library.exception.BookNotFoundException;
import com.ajackus.digital_library.mapper.BookMapper;
import com.ajackus.digital_library.model.Book;
import com.ajackus.digital_library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book addBook(BookDTO bookDTO) {
        Book book = BookMapper.toEntity(bookDTO);
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(String bookId) {
        return bookRepository.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException("Book with ID " + bookId + " not found"));
    }

    @Override
    public List<Book> searchBooksByTitle(String title) {
        return bookRepository.findByTitleContainingIgnoreCase(title);
    }

    @Override
    public Book updateBook(String bookId, BookDTO bookDTO) {
        Book existingBook = getBookById(bookId);
        existingBook.setTitle(bookDTO.getTitle());
        existingBook.setAuthor(bookDTO.getAuthor());
        existingBook.setGenre(bookDTO.getGenre());
        existingBook.setAvailabilityStatus(bookDTO.getAvailabilityStatus());
        return bookRepository.save(existingBook);
    }

    @Override
    public void deleteBook(String bookId) {
        if (!bookRepository.existsById(bookId)) {
            throw new BookNotFoundException("Book with ID " + bookId + " not found");
        }
        bookRepository.deleteById(bookId);
    }
}
