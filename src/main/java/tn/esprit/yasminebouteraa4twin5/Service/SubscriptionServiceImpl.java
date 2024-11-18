package tn.esprit.yasminebouteraa4twin5.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import tn.esprit.yasminebouteraa4twin5.Entity.Subscription;
import tn.esprit.yasminebouteraa4twin5.Entity.TypeSubscription;
import tn.esprit.yasminebouteraa4twin5.Repositoires.ISubscriptionRepository;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class SubscriptionServiceImpl implements ISubscriptionService {
    public final ISubscriptionRepository subscriptionRepository;
    public Subscription addSubscription(Subscription subscription){
        return subscriptionRepository.save(subscription);

    }

    @Override
    public Subscription UpdateSubscription(Subscription subscription) {
        return null;
    }

    @Override
    public Subscription retrieveSubscription(Long numSub) {
        return null;
    }

    @Override
    public List<Subscription> retrieveAll() {
        return null;
    }

    @Override
    public void removeSubscription(Long numSub) {

    }

    @Query
            ("SELECT s FROM Skier s WHERE s.subscription.typesubscription = :subscriptionType ORDER BY s.subscription.starDate ASC")

    public Set<Subscription> getSubscriptionByType(@Param("subscriptionType") TypeSubscription type) {
        return subscriptionRepository.findByTypeSubscription(type);
    }


}
