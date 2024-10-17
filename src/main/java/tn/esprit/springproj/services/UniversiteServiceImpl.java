package tn.esprit.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproj.repository.UniversiteRepository;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService{
    UniversiteRepository universiteRepository;
}
