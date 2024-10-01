package tn.esprit.springproj.entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "bloc")
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;
}
