package Service;
import model.Evaluation;
import model.Matiere;
import java.util.*;
public interface MatiereService {

    Matiere create(Matiere matiere);
    List<Matiere> read();
    Matiere update(Long id,Matiere matiere);
    String delete(Long id);
}
