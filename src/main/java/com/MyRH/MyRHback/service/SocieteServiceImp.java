package com.MyRH.MyRHback.service;

import com.MyRH.MyRHback.entity.Societe;
import com.MyRH.MyRHback.repository.SocieteRepository;
import com.MyRH.MyRHback.service.ServiceInterface.SocieteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocieteServiceImp implements SocieteService {

    private final SocieteRepository societeRepository;

    @Autowired
    public SocieteServiceImp(SocieteRepository societeRepository) {
        this.societeRepository = societeRepository;
    }

    @Override
    public Societe create(Societe societe) {
        return societeRepository.save(societe);
    }
}
