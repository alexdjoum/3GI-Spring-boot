package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Lesson")
@Getter
@Setter
@NoArgsConstructor
public class Lesson {
    private Long chapter_id;

    @Column(length=100)
    private String title;

    @Column(length=150)
    private String description;

    private Integer lesson_order;

    @Column(length=200)
    private String video_url;

    private Integer duration;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
