package tn.esprit.springproj.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomE;
    private String prenomE;
    private Long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL)
    private Set<Tache> taches;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
    @Enumerated(EnumType.STRING)
    private TypeEtudiant typeEtudiant;

    @OneToOne(mappedBy = "etudiantA")
    private Tache tache;
}
