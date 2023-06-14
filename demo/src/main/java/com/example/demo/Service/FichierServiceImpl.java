package com.example.demo.Service;

import lombok.AllArgsConstructor;
import com.example.demo.model.Fichier;
import org.springframework.stereotype.Service;
import com.example.demo.repository.FichierRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FichierServiceImpl implements FichierService {

    private final FichierRepository fichierRepository;


    @Override
    public Fichier create(Fichier fichier) {
        return fichierRepository.save(fichier);
    }

    @Override
    public List<Fichier> read() {
        return fichierRepository.findAll();
    }

    @Override
    public Fichier update(Long id, Fichier fichier ) {
        return fichierRepository.findById(id)
                .map(fic->{
                    fic.setTitle(fichier.getTitle());
                    fic.setDescription(fichier.getDescription());
                    fic.setChemin(fichier.getChemin());
                    fic.setType(fichier.getType());
                    return fichierRepository.save(fic);

                }).orElseThrow(()->new RuntimeException("Fichier introuvable ! "));
    }

    @Override
    public String delete(Long id) {
        fichierRepository.deleteById(id);
        return "Fichier introuvable";
    }
}
