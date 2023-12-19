package com.MyRH.MyRHback.entity;

import com.MyRH.MyRHback.enums.NiveauEtude;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Offre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titre;
    private String description;
    private String profile;
    private float salaire;
    private NiveauEtude niveau_etude;

    @OneToMany(mappedBy="offre")
    private List<Postule> postule;

    @ManyToOne
    @JoinColumn(name = "offreId" ,referencedColumnName = "id")
    private Societe societe;

}
