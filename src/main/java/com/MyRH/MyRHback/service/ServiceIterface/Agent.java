package com.MyRH.MyRHback.service.ServiceIterface;

import com.MyRH.MyRHback.entity.Offre;

public interface Agent {
    boolean login(Agent agent);
    boolean valide(Offre offre);
    boolean refuse(Offre offre);
}
