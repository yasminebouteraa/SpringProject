package tn.esprit.yasminebouteraa4twin5.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;
@Getter
@Setter
@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numPISTE;
    private String namePiste;
    private int lenght;
    private int slope;
    @Enumerated(EnumType.STRING)
    private Color color;

    public int getNumPISTE() {
        return numPISTE;
    }

    public void setNumPISTE(int numPISTE) {
        this.numPISTE = numPISTE;
    }

    public String getNamePiste() {
        return namePiste;
    }

    public void setNamePiste(String namePiste) {
        this.namePiste = namePiste;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getSlope() {
        return slope;
    }

    public void setSlope(int slope) {
        this.slope = slope;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Set<Skier> getSkiers() {
        return skiers;
    }

    public void setSkiers(Set<Skier> skiers) {
        this.skiers = skiers;
    }

    @ManyToMany
    Set<Skier> skiers;
}

