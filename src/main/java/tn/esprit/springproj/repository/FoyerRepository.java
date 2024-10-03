package tn.esprit.springproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproj.entities.Bloc;
import tn.esprit.springproj.entities.Foyer;

public interface FoyerRepository  extends JpaRepository<Foyer,Long> {
    Foyer findByNomFoyer(String nomFoyer);
    Foyer findByNomFoyerAndCapaciteFoyer(String nomFoyer , Long capaciteFoyer);
}
