package Service;
import model.Evaluation;
import model.Formateur;
import java.util.*;
public interface FormateurService {

    Formateur create(Formateur formateur);
    List<Formateur> read();
    Formateur update(Long id,Formateur formateur );
    String delete(Long id);
}
