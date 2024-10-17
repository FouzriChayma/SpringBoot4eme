package tn.esprit.springproj.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springproj.services.IUniversiteService;

@RestController
@AllArgsConstructor
public class UniversiteRestController {
    IUniversiteService universiteService;
}
