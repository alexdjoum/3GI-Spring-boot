package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Formateur")
@Getter
@Setter
@NoArgsConstructor
public class Formateur {

    @Column(length=50)
    private String first_name;

    @Column(length=50)
    private String last_name;

    @Column(length=100)
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}
