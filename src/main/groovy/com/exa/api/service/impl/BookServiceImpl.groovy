package com.exa.api.service.impl

import com.exa.api.entity.Book
import com.exa.api.repository.BookRepository
import com.exa.api.service.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.List

@Service
class BookServiceImpl implements BookService{
    @Autowired
    private final BookRepository BookRepository

    @Override
    List<Category> findAll(){
        BookRepository.findAll()
    }

    @Override
    Book findById(int id){
        BookRepository.findById(id)
    }

    @Override
    Book save(Book book){
        BookRepository.save(book)
    }

    @Override
    Book update(Book book, int id){
        def record = BookRepository.findById(id)
        record with{
            name = book.name
        }

        BookRepository.save(record)
        record
    }

    @Override
    Book delete(int id){
        def record = BookRepository.findById(id)
        BookRepository.delete(record)
        record
    }
}