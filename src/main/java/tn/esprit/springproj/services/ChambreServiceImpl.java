package tn.esprit.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproj.entities.Chambre;
import tn.esprit.springproj.repository.ChambreRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {
    ChambreRepository chambreRepository;
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    public Chambre addChambre(Chambre ch) {
        return chambreRepository.save(ch);
    }


    public Chambre updateChambre(Chambre ch) {
        return chambreRepository.save(ch);
    }

    public Chambre retriveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    public void removeChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

}
