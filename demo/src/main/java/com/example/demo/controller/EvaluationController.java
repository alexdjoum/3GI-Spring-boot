package com.example.demo.controller;

import com.example.demo.Service.EvaluationService;
import lombok.AllArgsConstructor;
import com.example.demo.model.Evaluation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Evaluation")
@AllArgsConstructor
public class EvaluationController {


    private final EvaluationService evaluationService;

    @PostMapping("/creer")
    public Evaluation creer(@RequestBody Evaluation evaluation)
    {

        return evaluationService.create(evaluation);
    }
    @GetMapping("/lire")
    public List<Evaluation> lire(){
        return evaluationService.read();

    }
    @PutMapping("/modifier/{id}")
    public Evaluation modifier(@PathVariable Long id, @RequestBody Evaluation evaluation){
        return evaluationService.update(id,evaluation);


    }
    @DeleteMapping("/supprimer")
    public String supprimer(@PathVariable Long id){
        return evaluationService.delete(id);

    }
}
