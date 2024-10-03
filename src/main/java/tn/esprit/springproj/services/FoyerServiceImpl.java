package tn.esprit.springproj.services;

import tn.esprit.springproj.entities.Foyer;
import tn.esprit.springproj.repository.FoyerRepository;

import java.util.List;
// ki tjini erreur n implimnter les methodes lkol base khtr nimplimenty mn interface
public class FoyerServiceImpl implements IFoyerService{

    FoyerRepository foyerRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retriveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }
}
