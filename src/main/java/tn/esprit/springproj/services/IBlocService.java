package tn.esprit.springproj.services;

import tn.esprit.springproj.entities.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveAllFoyers();
    Bloc addBloc(Bloc b);
    Bloc updateBloc(Bloc b);
    Bloc retriveBloc(Long idBloc);
    void removeBloc(Long idBloc);
}
