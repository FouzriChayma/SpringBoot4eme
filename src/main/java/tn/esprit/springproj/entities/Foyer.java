package tn.esprit.springproj.entities;

import jakarta.persistence.*;

import java.util.List;

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
    private List<Bloc> blocs;
}
