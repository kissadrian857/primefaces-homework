package ulyssys.java.course.homework.mbean;

import ulyssys.java.course.homework.entity.Author;
import ulyssys.java.course.homework.service.AuthorService;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class AuthorCRUDMbean implements Serializable {

    private List<Author> list;

    private Author selectedAuthor;

    @Inject
    AuthorService authorService;

    @PostConstruct
    private void init() {
        list = authorService.getAll();
        selectedAuthor = new Author();
    }

}
