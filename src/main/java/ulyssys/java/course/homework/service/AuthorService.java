package ulyssys.java.course.homework.service;

import ulyssys.java.course.homework.entity.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAll();

    void add(Author author);

    void remove(Author author);

    void update(Author author);
}
