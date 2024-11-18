package tn.esprit.yasminebouteraa4twin5.Repositoires;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import tn.esprit.yasminebouteraa4twin5.Entity.Subscription;
import tn.esprit.yasminebouteraa4twin5.Entity.TypeSubscription;

import java.util.Set;

public interface ISubscriptionRepository extends CrudRepository<Subscription,Long> {
    void addSubscription(Subscription subscription);

    Set<Subscription> findByTypeSubscription(TypeSubscription type);
}
