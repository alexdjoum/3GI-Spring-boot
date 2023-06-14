package com.example.demo.controller;


import com.example.demo.Service.MatiereService;
import lombok.AllArgsConstructor;
import com.example.demo.model.Matiere;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Matiere")
@AllArgsConstructor
public class MatiereController {


    private final MatiereService matiereService;

    @PostMapping("/creer")
    public Matiere creer(@RequestBody Matiere matiere)
    {

        return matiereService.create(matiere);
    }
    @GetMapping("/lire")
    public List<Matiere> lire(){
        return matiereService.read();

    }
    @PutMapping("/modifier/{id}")
    public Matiere modifier(@PathVariable Long id, @RequestBody Matiere matiere){
        return matiereService.update(id,matiere);


    }
    @DeleteMapping("/supprimer")
    public String supprimer(@PathVariable Long id){
        return matiereService.delete(id);

    }


}
