package tn.esprit.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproj.entities.Bloc;
import tn.esprit.springproj.repository.BlocRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {
    BlocRepository blocRepository;
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }


    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    public Bloc retriveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public List<Bloc> retrieveAllFoyers() {
        return null;
    }
}
