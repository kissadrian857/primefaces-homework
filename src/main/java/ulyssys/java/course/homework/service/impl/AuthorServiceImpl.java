package ulyssys.java.course.homework.service.impl;

import ulyssys.java.course.homework.entity.Author;
import ulyssys.java.course.homework.service.AuthorService;

import javax.enterprise.context.ApplicationScoped;
import java.util.Date;

@ApplicationScoped
public class AuthorServiceImpl extends AbstractServiceImpl<Author> implements AuthorService {
    @Override
    public void update(Author author) {
        for (Author a : getAll()) {
            if (a.getId().equals(author.getId())) {
                a.setFirstName(author.getFirstName());
                a.setLastName(author.getLastName());
                a.setUsername(author.getUsername());
                a.setLastModifiedDate(new Date());
                break;
            }
        }
    }

//    public AuthorServiceImpl() {
//        for(int i = 0;i<5;i++){
//            Author author = new Author();
//            author.setUsername("Author" + i);
//            author.setLastName("AuthorLastName" + i);
//            author.setFirstName("AuthorFirstName" + i);
//            add(author);
//        }
//    }
}
