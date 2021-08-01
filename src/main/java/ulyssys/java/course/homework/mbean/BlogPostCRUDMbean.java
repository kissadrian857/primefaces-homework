package ulyssys.java.course.homework.mbean;

import ulyssys.java.course.homework.entity.BlogPost;
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

    private boolean inFunction;

    private BlogPost selectedBlogPost;

    @Inject
    BlogPostService blogPostService;

    @PostConstruct
    private void init() {
        list = blogPostService.getAll();
        selectedBlogPost = new BlogPost();
    }

    public void initSave() {
        selectedBlogPost = new BlogPost();
        inFunction = true;
    }

    public void initEdit(BlogPost blogPost) {
        selectedBlogPost = blogPost;
        inFunction = true;
    }

    public void save() {
        if (selectedBlogPost.getId() == null) {
            selectedBlogPost.setId(System.currentTimeMillis());
            blogPostService.add(selectedBlogPost);
        } else {
            blogPostService.update(selectedBlogPost);
        }
        list = blogPostService.getAll();
        selectedBlogPost = new BlogPost();
        inFunction = false;
    }

    public void remove(BlogPost blogPost) {
        blogPostService.remove(blogPost);
        list = blogPostService.getAll();
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

    public boolean isInFunction() {
        return inFunction;
    }
}
