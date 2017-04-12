package model;

import java.util.List;

public interface CourseIdeaDAO {

    boolean add(CourseIdeaModel idea);

    List<CourseIdeaModel> findAll();

    CourseIdeaModel findBySlug(String slug);
}
