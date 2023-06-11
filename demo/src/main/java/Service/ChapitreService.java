package Service;
import model.Chapitre;
import java.util.*;
public interface ChapitreService {

    Chapitre create(Chapitre chapitre);
    List<Chapitre> read();
    Chapitre update(Long id,Chapitre chapitre);
    String delete(Long id);
}
