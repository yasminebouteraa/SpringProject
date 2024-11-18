package tn.esprit.yasminebouteraa4twin5.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
@Getter
@Setter
@Entity
public class Skier implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSkier;
    private String firstname;
    private String lastname;
    private LocalDate birthDate;
    private String city;

    public int getIdSkier() {
        return idSkier;
    }

    public void setIdSkier(int idSkier) {
        this.idSkier = idSkier;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public Set<Registration> getRegistration() {
        return registration;
    }

    public void setRegistration(Set<Registration> registration) {
        this.registration = registration;
    }

    public Set<Piste> getPiste() {
        return piste;
    }

    public void setPiste(Set<Piste> piste) {
        this.piste = piste;
    }

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    Subscription subscription;
    @OneToMany(mappedBy = "skier", fetch = FetchType.EAGER)
    Set<Registration> registration;
    @ManyToMany(mappedBy = "skiers")
    Set<Piste> piste;



}
