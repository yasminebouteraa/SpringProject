package tn.esprit.yasminebouteraa4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.yasminebouteraa4twin5.Entity.Skier;
import tn.esprit.yasminebouteraa4twin5.Entity.Subscription;

import tn.esprit.yasminebouteraa4twin5.Service.SubscriptionServiceImpl;

@RestController
@RequestMapping("subscription")
@RequiredArgsConstructor
public class SubscriptionRestController {

    private final SubscriptionServiceImpl subscriptionService;
    @PostMapping("/add")
    public Subscription saveSubscription(@RequestBody Subscription subscription){

        return subscriptionService.addSubscription(subscription);
    }
    @GetMapping("/get/{numSub}")
    public   Subscription getSubscription(@PathVariable Long numSub){

        return subscriptionService.retrieveSubscription(numSub);

}
    @DeleteMapping("/delete/{numSub}")
    public void deleteSubscription(@PathVariable Long numSub) {
        subscriptionService.removeSubscription(numSub);
}

    @PutMapping("/update")
    public  Subscription updateSubscription(@RequestBody  Subscription subscription) {
        return  subscriptionService.UpdateSubscription(subscription);
    }



}