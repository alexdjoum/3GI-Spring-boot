package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Fichier")
@Getter
@Setter
@NoArgsConstructor
public class Fichier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length=100)
    private String title;

    @Column(length=150)
    private String description;

    @Column(length=200)
    private String chemin;

    private String type;


}
