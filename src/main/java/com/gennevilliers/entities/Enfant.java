package com.gennevilliers.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ENFANTS")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Enfant implements Serializable {



    @Column(length = 50)
    private String nom;

    @Column(length = 50)
    private String prenom;

    private int age;

    @Column(length = 50)
    private String sex;

    @Column(length = 50)
    private String allergie;


    @ManyToOne
    private Parent parent;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
