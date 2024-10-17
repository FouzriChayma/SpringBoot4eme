package tn.esprit.springproj.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springproj.services.ITacheService;

@RestController
@AllArgsConstructor
public class TacheRestController {
    ITacheService tacheService;
}
