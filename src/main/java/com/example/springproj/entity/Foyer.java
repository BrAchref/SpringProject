package com.example.springproj.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table (name = "Foyer")
public class Foyer implements Serializable {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column(name="idFoyer")
    private  Long idFoyer ; // cle primaire
    private String nomFoyer;
    private Long capaciteFoyer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    private Set<Bloc> blocs;
    @OneToOne
    private Universite universite;

}
