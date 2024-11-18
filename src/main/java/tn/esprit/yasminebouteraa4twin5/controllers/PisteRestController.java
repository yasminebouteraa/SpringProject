package tn.esprit.yasminebouteraa4twin5.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.yasminebouteraa4twin5.Entity.Instructor;
import tn.esprit.yasminebouteraa4twin5.Entity.Piste;
import tn.esprit.yasminebouteraa4twin5.Service.PisteServiceImpl;

@RestController
@RequestMapping("piste")
@RequiredArgsConstructor
public class PisteRestController {

    private final PisteServiceImpl pisteService;
    @PostMapping("/add")
    public Piste savePiste(@RequestBody Piste piste){
        return pisteService.addPiste(piste);
    }
    @GetMapping("/get/{numPiste}")
    public Piste getPiste(@PathVariable Long numPiste){
        return pisteService.retrievePiste(numPiste);
    }

    @DeleteMapping("/delete/{numPiste}")
    public void deletePiste(@PathVariable Long numPiste) {
      pisteService.retrievePiste(numPiste);
    }

    @PutMapping("/update")
    public Piste  updateInstructor(@RequestBody Piste piste) {
        return pisteService.UpdatePiste(piste);
    }



}
