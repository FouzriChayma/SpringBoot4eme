package tn.esprit.springproj.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "universite")
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUnivesite;
    private String nomUniversite;
    private String adresse;
    @OneToOne(mappedBy = "universite") //'universite' aham hk aaleh hatina mappedby fiha moch fl foyer
    private Foyer foyer;
}
