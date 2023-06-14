package com.example.demo.Service;

import lombok.AllArgsConstructor;
import com.example.demo.model.Systeme;
import org.springframework.stereotype.Service;
import com.example.demo.repository.SystemeRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class SystemeServiceImpl implements SystemeService {

    private final SystemeRepository systemeRepository;

    @Override
    public Systeme create(Systeme systeme) {
        return systemeRepository.save(systeme);
    }

    @Override
    public List<Systeme> read() {
        return systemeRepository.findAll();
    }

    @Override
    public Systeme update(Long id, Systeme systeme) {
        return systemeRepository.findById(id)
                .map(sys->{
                    sys.setDescription(systeme.getDescription());
                    sys.setNom(systeme.getNom());

                    return systemeRepository.save(systeme);

                }).orElseThrow(()->new RuntimeException("Systeme inconnu ! "));
    }

    @Override
    public String delete(Long id) {

        systemeRepository.deleteById(id);
        return "Systeme supprimé";
    }
}
