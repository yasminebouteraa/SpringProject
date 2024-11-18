package tn.esprit.yasminebouteraa4twin5.Service;

import tn.esprit.yasminebouteraa4twin5.Entity.Piste;

import java.util.List;

public interface IPisteService {

    Piste addPiste(Piste piste );

    Piste UpdatePiste(Piste piste);

    Piste retrievePiste(Long numPISTE);

    List<Piste> retrieveAll();

    void removePiste(Long numPISTE);
}