package tn.esprit.yasminebouteraa4twin5.Service;

import tn.esprit.yasminebouteraa4twin5.Entity.Color;
import tn.esprit.yasminebouteraa4twin5.Entity.Skier;
import tn.esprit.yasminebouteraa4twin5.Entity.TypeSubscription;

import java.time.LocalDate;
import java.util.List;

public interface ISkierService {
    Skier addSkier(Skier skier);
    Skier UpdateSkier(Skier skier);
    Skier retrieveSkier(Long numSkier);
    List<Skier> retrieveAll();
    void removeSkier(Long numSkier);
    void assignSkier(Long numSkier ,Long numPiste);

    //Skier getByFirstnameAndLastname(String fname,String laname);

    List<Skier>getByBirthDate(LocalDate birthday);

    List<Skier>assignSkierToPiste(String firstname, String lastname, Color color);

//    List<Skier> assignSkierToPiste(String firstname, String lastname, Color color);

    Skier addSkierAndAssignToCourse(Skier skier, Long numCourse);

    List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription typesubscription);

   Skier getSkierByFLname(String firstname, String lastname);
}
