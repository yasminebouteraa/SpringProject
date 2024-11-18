package tn.esprit.yasminebouteraa4twin5.Service;

import jakarta.persistence.Entity;
import lombok.RequiredArgsConstructor;
import tn.esprit.yasminebouteraa4twin5.Entity.Course;
import tn.esprit.yasminebouteraa4twin5.Repositoires.ICourseRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor

public class CourseServiceImpl implements ICourseService{
    public final ICourseRepository courseRepository;

    public Course addCourse(Course course){
        return courseRepository.save(course);

    }

    @Override
    public Course UpdateCourse(Course course) {
        return null;
    }

    @Override
    public Course retrieveCourse(Long numCourse) {
        return null;
    }

    @Override
    public List<Course> retrieveAll() {
        return null;
    }

    @Override
    public void removeCourse(Long numCourse) {

    }
}
