package tn.esprit.yasminebouteraa4twin5.Service;
import org.aspectj.apache.bcel.generic.Instruction;
import tn.esprit.yasminebouteraa4twin5.Entity.Instructor;

import java.util.List;

public interface IInstructorService {

    Instructor addInstructor(Instructor instructor );

    Instructor UpdateInstructor(Instructor instructor);

    Instructor retrieveInstructor(Long numInstructor);

    List<Instructor>retrieveAll();

    void removeInstructor(Long numInstructor );

}
