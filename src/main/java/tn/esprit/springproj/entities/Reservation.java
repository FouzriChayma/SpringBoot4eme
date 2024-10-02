package tn.esprit.springproj.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    private String idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean estValide = true;
    @ManyToMany(mappedBy = "reservations")
    private List<Etudiant> etudiants;
    @ManyToOne
    private Chambre chambre;
}