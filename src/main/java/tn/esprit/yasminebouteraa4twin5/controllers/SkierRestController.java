package tn.esprit.yasminebouteraa4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.yasminebouteraa4twin5.Entity.Color;
import tn.esprit.yasminebouteraa4twin5.Entity.Registration;
import tn.esprit.yasminebouteraa4twin5.Entity.Skier;
import tn.esprit.yasminebouteraa4twin5.Entity.TypeSubscription;
import tn.esprit.yasminebouteraa4twin5.Service.ISkierService;
import tn.esprit.yasminebouteraa4twin5.Service.SkierServiceImpl;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("skier")
@RestController
public class SkierRestController {
    private final ISkierService skierService;

    @PostMapping("/add")
    public Skier saveSkier(@RequestBody Skier skier) {

        return skierService.addSkier(skier);
    }

    @GetMapping("/get/{numSkier}")
    public Skier getSkier(@PathVariable Long numSkier) {
        return skierService.retrieveSkier(numSkier);
    }


    @DeleteMapping("/delete/{numSkier}")
    public void deletePiste(@PathVariable Long numSkier) {
        skierService.removeSkier(numSkier);

    }

    @PutMapping("/update")
    public Skier updateSkier(@RequestBody Skier skier) {
        return skierService.UpdateSkier(skier);
    }

@PutMapping("assign/{numPiste}/{numSkier}")
    public void assignSkier(@PathVariable Long numSkier,@PathVariable Long numPiste){
      skierService.assignSkier(numSkier,numPiste);

    }
    @GetMapping("/getByFLName/{FirstName}/{LastName}")
    public Skier getSkierByFLname(@PathVariable String FirstName,String LastName){
        return skierService.getSkierByFLname(FirstName,LastName);
    }


    @GetMapping("/getBy/{birthDate}")
    public List<Skier> getByBirthDate(@PathVariable LocalDate birthDate){
        return skierService.getByBirthDate(birthDate);   }


    @GetMapping("/assignSkierToPiste/{firstname}/{lastename}/{color}")
    public Skier assignSkierToPiste(@PathVariable String firstname, @PathVariable String lastename, @PathVariable Color color){
        return (Skier) skierService.assignSkierToPiste( firstname, lastename,  color);
    }


    @PostMapping("/addSkierAndAssignToCourse/{numCourse}")
    public Skier addSkierAndAssignToCourse(@RequestBody Skier skier, @PathVariable Long numCourse) {
        return skierService.addSkierAndAssignToCourse(skier, numCourse);
    }

    @GetMapping("/retrieveBySubscriptionType")
    public List<Skier> retrieveSkiersBySubscriptionType(@RequestParam TypeSubscription typesubscription) {
        return skierService.retrieveSkiersBySubscriptionType(typesubscription);
    }


}