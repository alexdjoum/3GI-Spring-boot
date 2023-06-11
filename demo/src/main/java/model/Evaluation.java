package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Evaluation")
@Getter
@Setter
@NoArgsConstructor
public class Evaluation {
    private Integer matiere_id;

    @Column(length=100)
    private String title;

    @Column(length=150)
    private String description;

    private Integer evaluation_ordrer;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;





}
