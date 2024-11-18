package tn.esprit.yasminebouteraa4twin5.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.yasminebouteraa4twin5.Entity.Instructor;
import tn.esprit.yasminebouteraa4twin5.Repositoires.IInstructorRepository;
import java.util.List;
@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements IInstructorService {

    private final IInstructorRepository instructorRepository;
    public Instructor addInstructor(Instructor instructor){

        return instructorRepository.save( instructor);
    }


    @Override
    public Instructor UpdateInstructor(Instructor instructor) {
        return null;
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        return null;
    }

    @Override
    public List<Instructor> retrieveAll() {
        return null;
    }

    @Override
    public void removeInstructor(Long numInstructor) {

    }
}
