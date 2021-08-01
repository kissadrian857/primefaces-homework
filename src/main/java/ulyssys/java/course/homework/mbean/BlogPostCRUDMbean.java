package ulyssys.java.course.homework.mbean;

import ulyssys.java.course.homework.entity.BlogPost;
import ulyssys.java.course.homework.service.AuthorService;
import ulyssys.java.course.homework.service.BlogPostService;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class BlogPostCRUDMbean implements Serializable {

    private List<BlogPost> list;

    private BlogPost selectedBlogPost;

    @Inject
    BlogPostService blogPostService;

    @PostConstruct
    private void init(){
        list = blogPostService.getAll();
        selectedBlogPost = new BlogPost();
    }

    public void save(){
        //TODO
    }

    public void remove(){
        //TODO
    }

    public List<BlogPost> getList() {
        return list;
    }

    public void setList(List<BlogPost> list) {
        this.list = list;
    }

    public BlogPost getSelectedBlogPost() {
        return selectedBlogPost;
    }

    public void setSelectedBlogPost(BlogPost selectedBlogPost) {
        this.selectedBlogPost = selectedBlogPost;
    }
}
