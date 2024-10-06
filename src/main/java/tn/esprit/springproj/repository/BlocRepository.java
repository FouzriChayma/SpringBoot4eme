package tn.esprit.springproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.springproj.entities.Bloc;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
// cntr + nnzl aal CrudRepository chtt7ali nra ces methodes save , ...
//fama zeda PagingAndSortingRepository fiha pageable
// fama zeda JpaRepository fih akthr w akthrrrr
    Bloc findByNomBloc(String nomBloc);
    Bloc findByNomBlocAndCapaciteBloc(String nomBloc , Long capaciteBloc);

}
