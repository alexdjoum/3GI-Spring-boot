package com.example.demo.Service;


import lombok.AllArgsConstructor;
import com.example.demo.model.Evaluation;
import org.springframework.stereotype.Service;
import com.example.demo.repository.EvaluationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EvaluationServiceImpl implements EvaluationService {

    private final EvaluationRepository evaluationRepository;


    @Override
    public Evaluation create(Evaluation evaluation) {
        return evaluationRepository.save(evaluation);
    }

    @Override
    public List<Evaluation> read() {
        return evaluationRepository.findAll();
    }

    @Override
    public Evaluation update(Long id, Evaluation evaluation) {
        return evaluationRepository.findById(id)
                .map(eval->{
                    eval.setTitle(eval.getTitle());
                    eval.setDescription(eval.getDescription());
                    eval.setMatiere_id(eval.getMatiere_id());
                    eval.setEvaluation_ordrer(eval.getEvaluation_ordrer());
                    return evaluationRepository.save(eval);

                }).orElseThrow(()->new RuntimeException("Evaluation inexistante ! "));
    }

    @Override
    public String delete(Long id) {
        evaluationRepository.deleteById(id);
        return "Evaluation inexistante";
    }
}
