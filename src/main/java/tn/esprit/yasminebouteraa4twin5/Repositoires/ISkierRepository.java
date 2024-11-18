package tn.esprit.yasminebouteraa4twin5.Repositoires;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.yasminebouteraa4twin5.Entity.Skier;
import tn.esprit.yasminebouteraa4twin5.Entity.TypeSubscription;

import java.time.LocalDate;
import java.util.List;

public interface ISkierRepository extends CrudRepository<Skier,Long> {
    Skier findByFirstnameAndLastname(String fname ,String lname);


    List<Skier>getByBirthDate(LocalDate birthDate);

    List<Skier> findBySubscription_TypeSub(TypeSubscription typeSubscription);

}
