package com.gennevilliers.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "PARENTS")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Parent implements Serializable {

    @Column(length = 50)
    private String nom;
    @Column(length = 50)
    private String prenom;
    @Column(length = 50)
    private String adressePostale;

    @Id
    @Column(length = 50)
    private String email;
    @Column(length = 50)
    private String telephone1;
    @Column(length = 50)
    private String telephone2;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Enfant> listEnfant;


}
