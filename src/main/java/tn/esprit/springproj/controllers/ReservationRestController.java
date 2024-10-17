package tn.esprit.springproj.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springproj.services.IReservationService;

@RestController
@AllArgsConstructor
public class ReservationRestController {
    IReservationService reservationService;
}
