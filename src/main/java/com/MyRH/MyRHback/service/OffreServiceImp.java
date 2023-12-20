package com.MyRH.MyRHback.service;

import com.MyRH.MyRHback.service.ServiceInterface.OffreService;
import com.MyRH.MyRHback.repository.OffreEmploiRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class OffreServiceImp implements OffreService {
    private final OffreEmploiRepository offreEmploiRepository;
    @Autowired // This annotation injects the repository dependency
    public OffreServiceImp(OffreEmploiRepository offreEmploiRepository) {
        this.offreEmploiRepository = offreEmploiRepository;
    }
}
