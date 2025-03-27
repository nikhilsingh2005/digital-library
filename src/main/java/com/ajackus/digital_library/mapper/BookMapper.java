package com.ajackus.digital_library.mapper;

import com.ajackus.digital_library.dto.BookDTO;
import com.ajackus.digital_library.model.Book;

public class BookMapper {
    public static Book toEntity(BookDTO dto) {
        return new Book(
                dto.getBookId(),
                dto.getTitle(),
                dto.getAuthor(),
                dto.getGenre(),
                dto.getAvailabilityStatus()
        );
    }
}
