package tn.esprit.yasminebouteraa4twin5.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter

public enum Color implements Serializable {

    Green,
      Blue,
    Red , Black,


}
