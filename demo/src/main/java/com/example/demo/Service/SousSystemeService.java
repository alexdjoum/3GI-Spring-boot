package com.example.demo.Service;

import com.example.demo.model.SousSysteme;
import java.util.List;

public interface SousSystemeService {

    SousSysteme create(SousSysteme sousSysteme);
    List<SousSysteme> read();
    SousSysteme update(Long id,SousSysteme sousSysteme);
    String delete(Long id);
}
