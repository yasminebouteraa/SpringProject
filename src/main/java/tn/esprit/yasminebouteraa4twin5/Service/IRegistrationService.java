package tn.esprit.yasminebouteraa4twin5.Service;

import tn.esprit.yasminebouteraa4twin5.Entity.Piste;
import tn.esprit.yasminebouteraa4twin5.Entity.Registration;

import java.util.List;

public interface IRegistrationService {
    Registration addRegistration( Registration registration );

    Registration UpdateRegistration( Registration registration);

    Registration retrieveRegistration(Long numRegistration);

    List< Registration> retrieveAll();

    void removeRegistration(Long numRegistration);


    public Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkieur) ;
    public Registration addRegistrationAndAssignToCourse(Registration registration, Long numCourse) ;

}
