package Service;

import lombok.AllArgsConstructor;
import model.Etudiant;
import org.springframework.stereotype.Service;
import repository.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements EtudiantService{


    private final EtudiantRepository etudiantRepository;

    @Override
    public Etudiant create(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> read() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant update(Long id, Etudiant etudiant) {
        return etudiantRepository.findById(id)
                .map(e->{
                    e.setEmail(etudiant.getEmail());
                    e.setFirst_name(etudiant.getFirst_name());
                    e.setLast_name(etudiant.getLast_name());
                    return etudiantRepository.save(e);

                }).orElseThrow(()->new RuntimeException("Etudiant non trouvé ! "));
    }

    @Override
    public String delete(Long id) {
        etudiantRepository.deleteById(id);
        return "Produit supprimé ";
    }
}
