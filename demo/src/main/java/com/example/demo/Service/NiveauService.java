package com.example.demo.Service;

import com.example.demo.model.Niveau;
import java.util.List;

public interface NiveauService {


    Niveau create(Niveau niveau);
    List<Niveau> read();
    Niveau update(Long id,Niveau niveau);
    String delete(Long id);
}
