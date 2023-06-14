package com.example.demo.Service;


import lombok.AllArgsConstructor;
import com.example.demo.model.Formation;
import org.springframework.stereotype.Service;
import com.example.demo.repository.FormationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FormationServiceImpl implements FormationService{

    private final FormationRepository formationRepository;

    @Override
    public Formation create(Formation formation) {
        return formationRepository.save(formation);
    }

    @Override
    public List<Formation> read() {
        return formationRepository.findAll();
    }

    @Override
    public Formation update(Long id, Formation formation) {
        return formationRepository.findById(id)
                .map(form->{
                    form.setDescription(formation.getDescription());
                    form.setTitle(formation.getTitle());
                    form.setEnd_date(formation.getEnd_date());
                    form.setStart_date(formation.getStart_date());

                    return formationRepository.save(form);

                }).orElseThrow(()->new RuntimeException("Formation inexistante ! "));
    }

    @Override
    public String delete(Long id) {

        formationRepository.deleteById(id);
        return "Formation supprimée";
    }
}
