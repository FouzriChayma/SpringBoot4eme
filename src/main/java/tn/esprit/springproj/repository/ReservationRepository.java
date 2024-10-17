package tn.esprit.springproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproj.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
