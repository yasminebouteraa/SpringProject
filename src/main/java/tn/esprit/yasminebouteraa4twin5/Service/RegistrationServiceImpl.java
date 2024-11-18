package tn.esprit.yasminebouteraa4twin5.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.yasminebouteraa4twin5.Entity.Course;
import tn.esprit.yasminebouteraa4twin5.Entity.Registration;
import tn.esprit.yasminebouteraa4twin5.Entity.Skier;
import tn.esprit.yasminebouteraa4twin5.Repositoires.ICourseRepository;
import tn.esprit.yasminebouteraa4twin5.Repositoires.IRegistrationRepository;
import tn.esprit.yasminebouteraa4twin5.Repositoires.ISkierRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements IRegistrationService{
    public final IRegistrationRepository registrationRepository;
    public  final ICourseRepository courseRepository;
    private final ISkierRepository skierRepository;

    public Registration addRegistration(Registration registration){
        return registrationRepository.save(registration);

    }

    @Override
    public Registration UpdateRegistration(Registration registration) {
        return null;
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        return null;
    }

    @Override
    public List<Registration> retrieveAll() {
        return null;
    }

    @Override
    public void removeRegistration(Long numRegistration) {

    }

    @Override
    public Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkier ){

        Skier skier = skierRepository.findById(numSkier).orElse(null);
        registration.setSkier(skier);
        return registrationRepository.save(registration);
    }


    @Override
    public Registration addRegistrationAndAssignToCourse(Registration registration, Long numCourse) {
        Course course = courseRepository.findById(numCourse).orElse(null);
        registration.setCourse(course);
        return registrationRepository.save(registration);
    }


}


