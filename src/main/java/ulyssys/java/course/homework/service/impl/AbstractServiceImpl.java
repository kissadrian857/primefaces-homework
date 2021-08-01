package ulyssys.java.course.homework.service.impl;

import java.util.ArrayList;
import java.util.List;

public class AbstractServiceImpl<T> {
    private List<T> list = new ArrayList<>();

    public List<T> getAll() {
        return list;
    }

    public void add(T entity) {
        list.add(entity);
    }

    public void remove(T entity) {
        list.remove(entity);
    }
}
