package model;

import com.github.slugify.Slugify;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CourseIdeaModel {

    private String mTitle;
    private String mCreator;
    private final String mSlug;
    private Set<String> mVoters;

    public CourseIdeaModel(String title, String creator) {
        mTitle = title;
        mCreator = creator;
        Slugify slugify = new Slugify();
        mSlug = slugify.slugify(title);
        mVoters = new HashSet<>();
    }

    public List<String> getVoters() {
        return new ArrayList<>(mVoters);
    }

    public String getTitle() {
        return mTitle;
    }

    public String getCreator() {
        return mCreator;
    }

    public String getSlug() {
        return mSlug;
    }

    public boolean addVoter(String voterUsername) {
        return mVoters.add(voterUsername);
    }

    public int getVoteCount() {
        return mVoters.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseIdeaModel that = (CourseIdeaModel) o;

        if (mTitle != null ? !mTitle.equals(that.mTitle) : that.mTitle != null) return false;
        return mCreator != null ? mCreator.equals(that.mCreator) : that.mCreator == null;
    }

    @Override
    public int hashCode() {
        int result = mTitle != null ? mTitle.hashCode() : 0;
        result = 31 * result + (mCreator != null ? mCreator.hashCode() : 0);
        return result;
    }
}
