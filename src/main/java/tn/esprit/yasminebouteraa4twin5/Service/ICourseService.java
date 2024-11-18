package tn.esprit.yasminebouteraa4twin5.Service;
import tn.esprit.yasminebouteraa4twin5.Entity.Course;
import java.util.List;

public interface ICourseService {

       Course addCourse(Course course );

       Course UpdateCourse(Course course);

       Course retrieveCourse(Long numCourse);

        List<Course> retrieveAll();

        void removeCourse(Long numCourse);


}
