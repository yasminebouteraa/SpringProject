package tn.esprit.yasminebouteraa4twin5.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;
@Getter
@Setter
@Entity
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCourse;
    private int level;
    private float price;
    private int timeSlot;
    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;
    @OneToMany(mappedBy = "course")
    Set<Registration>registration;

    public void setNumCourse(Long numCourse) {
    }
}
