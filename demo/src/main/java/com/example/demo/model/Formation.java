package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Formation")
@Getter
@Setter
public class Formation {
    @Column(length=100)
    private String title;

    @Column(length=150)
    private String description;

    @Column(length=50)
    private String start_date;

    @Column(length=50)
    private String end_date;

    private long instructor_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
