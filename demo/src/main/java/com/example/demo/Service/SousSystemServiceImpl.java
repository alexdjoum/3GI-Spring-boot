package com.example.demo.Service;

import lombok.AllArgsConstructor;
import com.example.demo.model.SousSysteme;
import org.springframework.stereotype.Service;
import com.example.demo.repository.SousSystemeRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class SousSystemServiceImpl implements SousSystemeService {

    private final SousSystemeRepository sousSystemeRepository;

    @Override
    public SousSysteme create(SousSysteme sousSysteme) {
        return sousSystemeRepository.save(sousSysteme);
    }

    @Override
    public List<SousSysteme> read() {
        return sousSystemeRepository.findAll();
    }

    @Override
    public SousSysteme update(Long id, SousSysteme sousSysteme) {
        return sousSystemeRepository.findById(id)
                .map(sys->{
                    sys.setDescription(sousSysteme.getDescription());
                    sys.setNom(sousSysteme.getNom());

                    return sousSystemeRepository.save(sousSysteme);

                }).orElseThrow(()->new RuntimeException("sous-Systeme inconnu ! "));
    }

    @Override
    public String delete(Long id) {

        sousSystemeRepository.deleteById(id);
        return "sous-Systeme supprimé";
    }
}
