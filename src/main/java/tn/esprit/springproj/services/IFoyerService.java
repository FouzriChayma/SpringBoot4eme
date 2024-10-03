package tn.esprit.springproj.services;

import tn.esprit.springproj.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();
    Foyer addFoyer(Foyer f);
    Foyer updateFoyer(Foyer f);
    Foyer retriveFoyer(Long idFoyer);
    void removeFoyer(Long idFoyer);
}
