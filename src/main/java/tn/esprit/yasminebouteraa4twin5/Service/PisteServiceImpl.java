package tn.esprit.yasminebouteraa4twin5.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.yasminebouteraa4twin5.Entity.Piste;
import tn.esprit.yasminebouteraa4twin5.Repositoires.IPisteRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class PisteServiceImpl implements IPisteService {
    public final IPisteRepository pisteRepository;
    public Piste addPiste(Piste piste){
        return pisteRepository.save(piste);

    }

    @Override
    public Piste UpdatePiste(Piste piste) {
        return null;
    }

    @Override
    public Piste retrievePiste(Long numPISTE) {
        return null;
    }

    @Override
    public List<Piste> retrieveAll() {
        return null;
    }

    @Override
    public void removePiste(Long numPISTE) {
    }





}
