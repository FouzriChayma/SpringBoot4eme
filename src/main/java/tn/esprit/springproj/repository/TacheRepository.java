package tn.esprit.springproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproj.entities.Tache;

@Repository
public interface TacheRepository extends JpaRepository<Tache,Long> {
}
