package com.example.demo.Service;
import com.example.demo.model.Chapitre;
import java.util.*;
public interface ChapitreService {

    Chapitre create(Chapitre chapitre);
    List<Chapitre> read();
    Chapitre update(Long id,Chapitre chapitre);
    String delete(Long id);
}
