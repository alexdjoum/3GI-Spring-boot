package Service;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import model.Formateur;
import org.springframework.stereotype.Service;
import repository.FormateurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FormateurServiceImpl implements FormateurService {

    private final FormateurRepository formateurRepository;

    @Override
    public Formateur create(Formateur formateur) {
        return formateurRepository.save(formateur);
    }

    @Override
    public List<Formateur> read() {
        return formateurRepository.findAll();
    }

    @Override
    public Formateur update(Long id, Formateur formateur) {
        return formateurRepository.findById(id)
                .map(form->{
                    form.setEmail(formateur.getEmail());
                    form.setFirst_name((formateur.getFirst_name()));
                    form.setLast_name(formateur.getLast_name());
                    return formateurRepository.save(form);

                }).orElseThrow(()->new RuntimeException("Formateur inexistant ! "));
    }

    @Override
    public String delete(Long id) {
        formateurRepository.deleteById(id);
        return "Formateur supprimé";
    }
}
