package com.ajackus.digital_library.dto;

import com.ajackus.digital_library.model.Book;
import jakarta.validation.constraints.NotBlank;

public class BookDTO {

    @NotBlank(message = "Book ID is required")
    private String bookId;

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Author is required")
    private String author;

    private String genre;
    private Book.AvailabilityStatus availabilityStatus;

    // Getters and setters...

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book.AvailabilityStatus getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(Book.AvailabilityStatus availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
}

