package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Entity
@Table(name="Etudiant")
@Getter
@Setter
@NoArgsConstructor
public class Etudiant {

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
