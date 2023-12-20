package com.MyRH.MyRHback.service.ServiceInterface;

import com.MyRH.MyRHback.entity.Agent;

public interface AgentService {
    Agent login(String email, String password);
    //boolean valide(Offre offre);
    //boolean refuse(Offre offre);
}
