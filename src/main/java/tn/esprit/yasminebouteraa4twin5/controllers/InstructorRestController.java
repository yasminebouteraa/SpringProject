package tn.esprit.yasminebouteraa4twin5.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.yasminebouteraa4twin5.Entity.Instructor;
import tn.esprit.yasminebouteraa4twin5.Service.InstructorServiceImpl;

@RestController
@RequestMapping("instructor")
@RequiredArgsConstructor
public class InstructorRestController {
    private final InstructorServiceImpl instructorService;
    @PostMapping("/add")
    public Instructor saveInstructor(@RequestBody Instructor instructor){
        return  instructorService.addInstructor(instructor);
    }
    @GetMapping("/get/{numInstructor}")
    public Instructor getInstructor(@PathVariable Long numInstructor){
        return  instructorService.retrieveInstructor(numInstructor);
    }

    @PutMapping("/update")
    public Instructor updateInstructor(@RequestBody Instructor instructor) {
        return instructorService.UpdateInstructor(instructor);
    }

    @DeleteMapping("/delete/{numInstructor}")
    public void deleteInstructor(@PathVariable Long numInstructor) {
        instructorService.removeInstructor(numInstructor);
    }

}
