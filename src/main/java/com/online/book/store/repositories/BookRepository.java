package com.online.book.store.repositories;

import com.online.book.store.entities.BookRegistration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<BookRegistration, String> {
    static List<BookRegistration> findByIsHomePage(boolean b) {
        return null;}

    List<BookRegistration> findAll();
    Page<BookRegistration> findAll(Pageable pageable);


}
