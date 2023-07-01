package ru.itgirl.jdbcspringexample.myclass;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
}
