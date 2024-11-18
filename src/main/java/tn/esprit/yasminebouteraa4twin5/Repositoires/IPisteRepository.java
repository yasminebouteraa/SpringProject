package tn.esprit.yasminebouteraa4twin5.Repositoires;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.yasminebouteraa4twin5.Entity.Color;
import tn.esprit.yasminebouteraa4twin5.Entity.Piste;

import java.util.List;
import java.util.Optional;

public interface IPisteRepository extends CrudRepository<Piste,Long> {
    List<Piste> findByColor(Color color);
}
