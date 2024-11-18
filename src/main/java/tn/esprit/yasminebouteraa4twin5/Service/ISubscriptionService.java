package tn.esprit.yasminebouteraa4twin5.Service;

import tn.esprit.yasminebouteraa4twin5.Entity.Subscription;
import tn.esprit.yasminebouteraa4twin5.Entity.TypeSubscription;

import java.util.List;
import java.util.Set;

public interface ISubscriptionService {

    Subscription addSubscription(Subscription subscription);

    Subscription UpdateSubscription( Subscription subscription );

    Subscription retrieveSubscription(Long  numSub);

    List<Subscription>retrieveAll();

    void removeSubscription(Long  numSub);

    Set<Subscription> getSubscriptionByType(TypeSubscription type);
}
