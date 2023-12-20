package com.MyRH.MyRHback.service.ServiceIterface;

import com.MyRH.MyRHback.entity.Postule;
import com.MyRH.MyRHback.entity.Societe;

import java.util.List;

public interface SocieteService {
    boolean login(String email,String password);
    Societe Create(Societe societe);
    List<Postule> consulte(Postule postule);
}
