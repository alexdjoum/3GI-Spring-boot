package Service;
import model.Etudiant;
import java.util.*;
public interface EtudiantService {

    Etudiant create(Etudiant etudiant);
    List<Etudiant> read();
    Etudiant update(Long id,Etudiant etudiant);
    String delete(Long id);


}
