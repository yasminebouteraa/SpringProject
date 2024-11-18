package tn.esprit.yasminebouteraa4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.yasminebouteraa4twin5.Entity.Course;

import tn.esprit.yasminebouteraa4twin5.Entity.Instructor;
import tn.esprit.yasminebouteraa4twin5.Service.CourseServiceImpl;
import tn.esprit.yasminebouteraa4twin5.Service.ICourseService;

@RestController
@RequestMapping("course")
@RequiredArgsConstructor
public class CourseRestController {
    private final ICourseService courseService;
    @PostMapping("/add")
    public Course saveCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }
    @GetMapping("/get/{numCourse}")
    public Course  getCourse (@PathVariable Long numCourse ){
        return courseService.retrieveCourse(numCourse);
    }

    @PutMapping("/update/{numCourse}")
    public Course updateInstructor(@RequestBody Course course) {
        return courseService.UpdateCourse(course);
    }
    @DeleteMapping("/delete")
    public void deleteInstructor(@PathVariable Long numCourse) {
       courseService.removeCourse(numCourse);
    }

}
