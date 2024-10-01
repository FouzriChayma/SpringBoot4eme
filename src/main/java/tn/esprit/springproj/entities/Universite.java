package tn.esprit.springproj.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "universite")
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUnivesite;
    private String nomUniversite;
    private String adresse;

}
