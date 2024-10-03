package tn.esprit.springproj.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "foyer")
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
    @OneToOne
    private Universite universite;
    @OneToMany(mappedBy = "foyer")
    private Set<Bloc> blocs;
}
