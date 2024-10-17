package tn.esprit.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproj.repository.TacheRepository;

@Service
@AllArgsConstructor
public class TacheServiceImpl implements ITacheService {
    TacheRepository tacheRepository;
}
