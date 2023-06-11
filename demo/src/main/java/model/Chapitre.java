package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Chapitre")
@Getter
@Setter
@NoArgsConstructor
public class Chapitre {

    private Integer subject_id;
    @Column(length=100)
    private String  title;

    @Column(length=150)
    private String description;

    private Integer chapter_order;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
