package tn.esprit.springproj.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    private String idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean estValide = true;
    @ManyToMany(mappedBy = "reservations")
    private Set<Etudiant> etudiants;

}