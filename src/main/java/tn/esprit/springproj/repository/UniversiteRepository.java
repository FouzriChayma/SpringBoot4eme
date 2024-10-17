package tn.esprit.springproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproj.entities.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {


}
