package tn.esprit.yasminebouteraa4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.yasminebouteraa4twin5.Entity.Piste;
import tn.esprit.yasminebouteraa4twin5.Entity.Registration;
import tn.esprit.yasminebouteraa4twin5.Service.RegistrationServiceImpl;


@RestController
@RequestMapping("registration")
@RequiredArgsConstructor
public class RegistrationRestController {

    private final RegistrationServiceImpl registrationService;

    @PostMapping("/add")
    public Registration saveRegistration(@RequestBody Registration registration) {

        return registrationService.addRegistration(registration);
    }

    @GetMapping("/get/{numRegistration}")
    public Registration getRegistration(@PathVariable Long numRegistration) {

        return registrationService.retrieveRegistration(numRegistration);
    }

    @DeleteMapping("/delete/{numRegistration}")
    public void deleteRegistration(@PathVariable Long numRegistration) {
        registrationService.removeRegistration(numRegistration);

    }
    @PutMapping("/update")
    public Registration  updateRegistration(@RequestBody Registration  registration) {
        return registrationService.UpdateRegistration(registration);
    }


@PutMapping("/assignToSkier/{numSkier}")
public Registration addRegistrationAndAssignToSkier(@RequestBody Registration registration,@PathVariable Long numSkier){
    return  registrationService.addRegistrationAndAssignToSkier(registration,numSkier);
}



    @PutMapping("/assignToCourse/{numCourse}")
    public Registration addRegistrationAndAssignToCourse(@RequestBody Registration registration,@PathVariable Long numCourse){
        return  registrationService.addRegistration(registration);
    }




}