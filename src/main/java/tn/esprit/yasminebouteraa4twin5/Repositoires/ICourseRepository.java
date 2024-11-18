package tn.esprit.yasminebouteraa4twin5.Repositoires;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.yasminebouteraa4twin5.Entity.Course;

public interface ICourseRepository extends CrudRepository<Course,Long> {
    Course retrieveCourse(Long numCourse);
}
