package com.example.demo.Service;

import com.example.demo.model.Systeme;
import java.util.List;

public interface SystemeService {

    Systeme create(Systeme systeme);
    List<Systeme> read();
    Systeme update(Long id,Systeme systeme);
    String delete(Long id);
}
