package Service;
import model.Etudiant;
import model.Evaluation;
import java.util.*;
public interface EvaluationService {

    Evaluation create(Evaluation evaluation);
    List<Evaluation> read();
    Evaluation update(Long id,Evaluation evaluation);
    String delete(Long id);
}
