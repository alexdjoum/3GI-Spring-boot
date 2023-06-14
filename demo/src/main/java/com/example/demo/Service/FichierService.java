package com.example.demo.Service;


import com.example.demo.model.Fichier;
import java.util.List;


public interface FichierService {


    Fichier create(Fichier fichier);
    List<Fichier> read();
    Fichier update(Long id, Fichier fichier);
    String delete(Long id);
}
