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

    public void save(){
        //TODO
    }

    public void remove(){
        //TODO
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
}
