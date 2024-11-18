package tn.esprit.yasminebouteraa4twin5.Repositoires;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.yasminebouteraa4twin5.Entity.Registration;

public interface IRegistrationRepository extends CrudRepository<Registration,Long> {

    void addRegistration(Registration registration);
}
