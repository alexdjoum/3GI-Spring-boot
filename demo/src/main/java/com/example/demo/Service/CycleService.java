package com.example.demo.Service;

import com.example.demo.model.Cycle;
import java.util.List;

public interface CycleService {

    Cycle create(Cycle cycle);
    List<Cycle> read();
    Cycle update(Long id,Cycle cycle);
    String delete(Long id);
}
