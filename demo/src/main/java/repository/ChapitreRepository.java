package repository;

import model.Chapitre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapitreRepository extends JpaRepository<Chapitre,Long> {
}
