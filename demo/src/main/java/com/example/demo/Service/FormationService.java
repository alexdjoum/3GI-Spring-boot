package com.example.demo.Service;
import com.example.demo.model.Formation;
import java.util.*;
public interface FormationService {

    Formation create(Formation formation);
    List<Formation> read();
    Formation update(Long id,Formation formation);
    String delete(Long id);
}
