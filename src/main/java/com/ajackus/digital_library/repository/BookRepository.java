package com.ajackus.digital_library.repository;

import com.ajackus.digital_library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, String> {

    // Custom query: search books by title (partial match)
    List<Book> findByTitleContainingIgnoreCase(String title);
}
