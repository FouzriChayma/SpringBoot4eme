package tn.esprit.springproj.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springproj.services.IBlocService;

@RestController
@AllArgsConstructor
public class BlocRestController {
    IBlocService blocService;
}
