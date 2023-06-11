package Service;

import lombok.AllArgsConstructor;
import model.Matiere;
import org.springframework.stereotype.Service;
import repository.MatiereRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MatiereServiceImpl implements MatiereService{

    private final MatiereRepository matiereRepository;

    @Override
    public Matiere create(Matiere matiere) {
        return matiereRepository.save(matiere);
    }

    @Override
    public List<Matiere> read() {
        return matiereRepository.findAll();
    }

    @Override
    public Matiere update(Long id, Matiere matiere) {
        return matiereRepository.findById(id)
                .map(mat->{
                    mat.setDescription(matiere.getDescription());
                    mat.setTitle(matiere.getTitle());

                    return matiereRepository.save(matiere);

                }).orElseThrow(()->new RuntimeException("Matiere introuvable ! "));
    }

    @Override
    public String delete(Long id) {

        matiereRepository.deleteById(id);
        return "Matiere supprimée";
    }
}
