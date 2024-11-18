package tn.esprit.yasminebouteraa4twin5.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@Entity
public class Registration  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long numRegistration;
    private  String numWeek;
    @ManyToOne
    Skier skier;
@ManyToOne
    Course course;
}
