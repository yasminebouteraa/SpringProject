package tn.esprit.yasminebouteraa4twin5.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class Instructor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInstructor ;
    private String firstName;
    private String lastName;
    private LocalDate Dateofhire;
    @OneToMany
    Set<Course> courses;


    }

