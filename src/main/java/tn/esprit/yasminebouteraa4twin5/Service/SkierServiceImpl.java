package tn.esprit.yasminebouteraa4twin5.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.yasminebouteraa4twin5.Entity.*;
import tn.esprit.yasminebouteraa4twin5.Repositoires.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SkierServiceImpl implements ISkierService {

    private  final ISkierRepository skierRepository;
    private  final IPisteRepository pisteRepository;
    private  final IRegistrationRepository registrationRepository;
    private  final ISubscriptionRepository SubscriptionRepository;
    private  final ICourseRepository CourseRepository;

    public Skier addSkier(Skier skier){

        return  skierRepository.save(skier);
    }

    @Override
    public Skier UpdateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier retrieveSkier(Long numSkier) {
        return skierRepository.findById(numSkier).orElse(null);
    }

    @Override
    public List<Skier> retrieveAll() {
        return (List<Skier>)skierRepository.findAll();
    }

    @Override
    public void removeSkier(Long numSkier) {
         skierRepository.deleteById(numSkier);

    }

    @Override
    public void assignSkier(Long numSkier, Long numPiste) {
        Skier skier =skierRepository.findById(numSkier).orElse(null);
      Piste piste =pisteRepository.findById(numPiste).orElse(null)  ;
    piste.getSkiers().add(skier);
    pisteRepository.save(piste);

    }

    @Override
    public Skier getSkierByFLname(String fname, String lname) {
        return skierRepository.findByFirstnameAndLastname(fname ,lname);
    }

    @Override
    public List<Skier> getByBirthDate(LocalDate BirthDate) {
        return null;
    }


    @Override
    public List<Skier> assignSkierToPiste(String firstname, String lastname, Color color){
        List<Skier> skier = skierRepository.findByFirstnameAndLastname(firstname,lastname);
        List<Piste> piste = pisteRepository.findByColor(color);
        for(Skier s : skier) {
            for(Piste p : piste) {
                p.getSkiers().add(s);
            }
            skierRepository.save(s);
        }
        return skier;
    }



    @Override
    public Skier addSkierAndAssignToCourse(Skier skier, Long numCourse) {
            Subscription subscription = new Subscription();
            skier.setSubscription(subscription);
            SubscriptionRepository.addSubscription(subscription);
            Course course = CourseRepository.retrieveCourse(numCourse);
            Registration registration = new Registration();
            registration.setCourse(course);
            registration.setSkier(skier);
            if (skier.getRegistration() == null) {
                skier.setRegistration(new HashSet<>());
            }
            skier.getRegistration().add(registration);
            registrationRepository.addRegistration(registration);
            return skierRepository.save(skier);
        }








    @Override
    public List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription typeSubscription) {
        return skierRepository.findBySubscription_TypeSub(typeSubscription);
    }




}
