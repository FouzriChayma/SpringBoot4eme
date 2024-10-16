package tn.esprit.springproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproj.entities.Bloc;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
// cntr + nnzl aal CrudRepository chtt7ali nra ces methodes save , ...
//fama zeda PagingAndSortingRepository fiha pageable
// fama zeda JpaRepository fih akthr w akthrrrr
    Bloc findByNomBloc(String nomBloc);
    Bloc findByNomBlocAndCapaciteBloc(String nomBloc , Long capaciteBloc);

    // Liste des blocs d'une université donnée (en keyword)
    List<Bloc> findByFoyerUniversiteIdUnivesite(Long universiteId); // Keyword Query

    // Liste des blocs d'une université donnée (en JPQL)
    @Query("SELECT b FROM Bloc b JOIN b.foyer f WHERE f.universite.idUnivesite = :universiteId")
    List<Bloc> findBlocsByUniversiteId(@Param("universiteId") Long universiteId);


}
