package com.example.demo.Service;
import com.example.demo.model.Evaluation;
import java.util.*;
public interface EvaluationService {

    Evaluation create(Evaluation evaluation);
    List<Evaluation> read();
    Evaluation update(Long id,Evaluation evaluation);
    String delete(Long id);
}
