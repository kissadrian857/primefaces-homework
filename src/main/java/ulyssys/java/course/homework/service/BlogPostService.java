package ulyssys.java.course.homework.service;

import ulyssys.java.course.homework.entity.BlogPost;

import java.util.List;

public interface BlogPostService {
    List<BlogPost> getAll();

    void add(BlogPost blogPost);

    void remove(BlogPost blogPost);

    void update(BlogPost blogPost);
}
