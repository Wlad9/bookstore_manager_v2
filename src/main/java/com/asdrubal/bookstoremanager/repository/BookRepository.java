package com.asdrubal.bookstoremanager.repository;

import com.asdrubal.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
