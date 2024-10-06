package tn.esprit.springproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproj.entities.Bloc;
import tn.esprit.springproj.entities.Chambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    List<Chambre> findByBlocNomBloc(String nom);
    Bloc findByNumeroChambre(Long numeroChambre);
}
