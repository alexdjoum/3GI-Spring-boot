package Service;

import lombok.AllArgsConstructor;
import model.Chapitre;
import org.springframework.stereotype.Service;
import repository.ChapitreRepository;


import java.util.List;

@Service
@AllArgsConstructor
public class ChapitreServiceImpl implements ChapitreService {

    private final ChapitreRepository chapitreRepository;
    @Override
    public Chapitre create(Chapitre chapitre) {

        return chapitreRepository.save(chapitre);
    }

    @Override
    public List<Chapitre> read() {
        return chapitreRepository.findAll();
    }

    @Override
    public Chapitre update(Long id, Chapitre chapitre) {
        return chapitreRepository.findById(id)
                .map(ch->{
                    ch.setChapter_order(chapitre.getChapter_order());
                    ch.setDescription(chapitre.getDescription());
                    ch.setTitle(chapitre.getTitle());
                    ch.setSubject_id(chapitre.getSubject_id());

                    return chapitreRepository.save(ch);

                }).orElseThrow(()->new RuntimeException("Chapitre non trouvé ! "));
    }

    @Override
    public String delete(Long id) {
        chapitreRepository.deleteById(id);
        return "chapitre supprimé";
    }
}
