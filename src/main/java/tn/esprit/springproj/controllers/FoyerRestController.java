package tn.esprit.springproj.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springproj.services.IFoyerService;

@RestController
@AllArgsConstructor
public class FoyerRestController {
    IFoyerService foyerService;
}
