package com.MyRH.MyRHback.controller;

import com.MyRH.MyRHback.entity.Agent;
import com.MyRH.MyRHback.entity.Societe;
import com.MyRH.MyRHback.service.ServiceInterface.SocieteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/societes")
public class SocieteController {

    private final SocieteService societeService;

    @Autowired
    public SocieteController(SocieteService societeService) {
        this.societeService = societeService;
    }

    @PostMapping("/inscription")
    public ResponseEntity<Societe> inscriptionSociete(@RequestBody Societe societe) {
        try {
            // Vous pouvez ajouter ici la logique de validation, de chiffrement du mot de passe, etc.
            Societe nouvelleSociete = societeService.create(societe);
            return ResponseEntity.ok(nouvelleSociete);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new Societe());
        }
    }
}
