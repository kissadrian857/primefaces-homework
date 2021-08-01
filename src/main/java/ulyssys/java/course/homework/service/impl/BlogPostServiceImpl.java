package ulyssys.java.course.homework.service.impl;

import ulyssys.java.course.homework.entity.BlogPost;
import ulyssys.java.course.homework.service.BlogPostService;

import javax.enterprise.context.ApplicationScoped;
import java.util.Date;

@ApplicationScoped
public class BlogPostServiceImpl extends AbstractServiceImpl<BlogPost> implements BlogPostService {
    @Override
    public void update(BlogPost blogPost) {
        for (BlogPost b : getAll()) {
            if (blogPost.getId().equals(b.getId())) {
                b.setTitle(blogPost.getTitle());
                b.setContent(blogPost.getContent());
                b.setCategory(blogPost.getCategory());
                b.setLastModifiedDate(new Date());
                b.setPublishedDate(blogPost.getPublishedDate());
                break;
            }
        }
    }

//    public BlogPostServiceImpl() {
//        for (int i = 0; i < 5; i++) {
//            BlogPost blogPost = new BlogPost();
//            blogPost.setTitle("Blogpost" + i);
//            add(blogPost);
//        }
//    }
}
