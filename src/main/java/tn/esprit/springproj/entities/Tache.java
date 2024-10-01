package tn.esprit.springproj.entities;

import jakarta.persistence.*;

import java.lang.reflect.Type;
import java.time.LocalDate;

@Entity
@Table(name = "tache")
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTache;
    private LocalDate dateTache;
    private Integer duree;
    private float tarifHoraire;
    @Enumerated(EnumType.STRING)
    private TypeTache typetache;

}
