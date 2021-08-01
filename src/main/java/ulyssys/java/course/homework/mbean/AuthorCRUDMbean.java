package ulyssys.java.course.homework.mbean;

import ulyssys.java.course.homework.entity.Author;
import ulyssys.java.course.homework.service.AuthorService;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Named
@ViewScoped
public class AuthorCRUDMbean implements Serializable {

    private List<Author> list;

    private boolean inFunction;

    private Author selectedAuthor;

    @Inject
    AuthorService authorService;

    @PostConstruct
    private void init() {
        list = authorService.getAll();
        selectedAuthor = new Author();
    }

    public void initSave() {
        selectedAuthor = new Author();
        inFunction = true;
    }

    public void initEdit(Author author) {
        selectedAuthor = author;
        inFunction = true;
    }

    public void save() {
        if (selectedAuthor.getId() == null) {
            selectedAuthor.setId(System.currentTimeMillis());
            selectedAuthor.setCreatedDate(new Date());
            selectedAuthor.setLastModifiedDate(new Date());
            authorService.add(selectedAuthor);
        } else {
            selectedAuthor.setLastModifiedDate(new Date());
            authorService.update(selectedAuthor);
        }
        list = authorService.getAll();
        selectedAuthor = new Author();
        inFunction = false;
    }

    public void remove(Author author) {
        authorService.remove(author);
        list = authorService.getAll();
    }

    public List<Author> getList() {
        return list;
    }

    public void setList(List<Author> list) {
        this.list = list;
    }

    public Author getSelectedAuthor() {
        return selectedAuthor;
    }

    public void setSelectedAuthor(Author selectedAuthor) {
        this.selectedAuthor = selectedAuthor;
    }

    public boolean isInFunction() {
        return inFunction;
    }
}
