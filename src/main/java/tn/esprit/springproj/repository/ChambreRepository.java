package tn.esprit.springproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.springproj.entities.Bloc;
import tn.esprit.springproj.entities.Chambre;
import tn.esprit.springproj.entities.TypeChambre;

import java.util.List;
@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    List<Chambre> findByBlocNomBloc(String nom);
    Bloc findByNumeroChambre(Long numeroChambre);
    // Liste des chambres double d'un bloc donné (en keyword)
    //List<Chambre> findByBlocIdAndTypeC(Long blocId, TypeChambre typeC); // Keyword Query

    // Liste des chambres double d'un bloc donné (en JPQL)
   // @Query("SELECT c FROM Chambre c WHERE c.bloc.idBloc = :blocId AND c.typeC = 'DOUBLE'")
   // List<Chambre> findDoubleChambresByBlocId(@Param("blocId") Long blocId);
    // Liste des chambres avec des réservations valides ou non (en keyword)
   // List<Chambre> findByReservationEstValide(boolean estValide);

    // Liste des chambres avec des réservations valides ou non (en JPQL)
   // @Query("SELECT c FROM Chambre c JOIN c.reservation r WHERE r.estValide = :estValide")
   // List<Chambre> findChambresByReservationValide(@Param("estValide") boolean estValide);

    // Liste des chambres appartenant à un bloc donné avec une capacité supérieure à un nombre donné (en keyword)
    //List<Chambre> findByBlocIdAndBlocCapaciteBlocGreaterThan(Long blocId, Long capaciteBloc);

    // Liste des chambres appartenant à un bloc donné avec une capacité supérieure à un nombre donné (en JPQL)
   // @Query("SELECT c FROM Chambre c WHERE c.bloc.idBloc = :blocId AND c.bloc.capaciteBloc > :capaciteBloc")
    //List<Chambre> findChambresByBlocIdAndCapacite(@Param("blocId") Long blocId, @Param("capaciteBloc") Long capaciteBloc);
}
