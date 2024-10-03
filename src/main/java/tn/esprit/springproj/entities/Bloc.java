package tn.esprit.springproj.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "bloc")
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc; //far9 bin long w Long theny nkhdmo bih chnaaamlo far9
    private String nomBloc;
    private long capaciteBloc;
    @ManyToOne
    private Foyer foyer;
    @OneToMany(mappedBy = "bloc")
    private Set<Chambre> chambres;
}
