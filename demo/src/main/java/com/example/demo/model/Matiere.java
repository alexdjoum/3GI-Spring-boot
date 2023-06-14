package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Matiere")
@Getter
@Setter
@NoArgsConstructor

public class Matiere {

    private String title;
    private String description ;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
