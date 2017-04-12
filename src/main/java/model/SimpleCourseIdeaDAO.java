package model;

import java.util.ArrayList;
import java.util.List;


public class SimpleCourseIdeaDAO implements CourseIdeaDAO{

    private List<CourseIdeaModel> mIdeas;

    public SimpleCourseIdeaDAO() {
        mIdeas = new ArrayList<>();
    }

    @Override
    public boolean add(CourseIdeaModel idea) {
        return mIdeas.add(idea);
    }

    @Override
    public List<CourseIdeaModel> findAll() {
        return new ArrayList<>(mIdeas);
    }

    @Override
    public CourseIdeaModel findBySlug(String slug) {
        return mIdeas.stream()
                .filter(i -> i.getSlug().equals(slug))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }
}
