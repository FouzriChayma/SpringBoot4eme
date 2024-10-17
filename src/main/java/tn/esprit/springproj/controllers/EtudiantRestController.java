package tn.esprit.springproj.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springproj.services.IEtudiantService;

@RestController
@AllArgsConstructor
public class EtudiantRestController {
    IEtudiantService etudiantService;
}
