package ru.itgirl.jdbcspringexample.myclass;

import java.sql.SQLException;
import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();

    Book findBookById(long id) throws SQLException;
}
