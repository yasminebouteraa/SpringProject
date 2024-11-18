package tn.esprit.yasminebouteraa4twin5.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSub;
    private LocalDate starDate;
    private LocalDate endDate;
    private float price;
    @Enumerated(EnumType.STRING)
    private TypeSubscription typesubscription;

}


