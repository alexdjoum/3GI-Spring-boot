package com.example.demo.Service;

import lombok.AllArgsConstructor;
import com.example.demo.model.Niveau;
import org.springframework.stereotype.Service;
import com.example.demo.repository.NiveauRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class NiveauServiceImpl implements NiveauService{

    private final NiveauRepository niveauRepository;

    @Override
    public Niveau create(Niveau niveau) {
        return niveauRepository.save(niveau);
    }

    @Override
    public List<Niveau> read() {
        return niveauRepository.findAll();
    }

    @Override
    public Niveau update(Long id, Niveau niveau) {
        return niveauRepository.findById(id)
                .map(niv->{
                    niv.setDescription(niveau.getDescription());
                    niv.setIntitule(niveau.getIntitule());

                    return niveauRepository.save(niveau);

                }).orElseThrow(()->new RuntimeException("Niveau Inconnu ! "));
    }

    @Override
    public String delete(Long id) {

        niveauRepository.deleteById(id);
        return "Niveau supprimé";
    }
}
