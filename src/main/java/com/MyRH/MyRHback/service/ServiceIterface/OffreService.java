package com.MyRH.MyRHback.service.ServiceIterface;

import com.MyRH.MyRHback.entity.Offre;
import java.util.List;

public interface OffreService {
    List<Offre> fetch();
    Offre create(Offre offre);
    Offre update(Offre offre);
    Offre delete(Offre offre);
}
