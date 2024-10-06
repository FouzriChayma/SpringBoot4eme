package tn.esprit.springproj.services;

import tn.esprit.springproj.entities.Chambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre ch);
    Chambre updateChambre(Chambre ch);
    Chambre retriveChambre(Long idChambre);
    void removeChambre(Long idChambre);
}
