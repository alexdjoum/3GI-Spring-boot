package com.example.demo.controller;


import com.example.demo.Service.FormateurService;
import lombok.AllArgsConstructor;
import com.example.demo.model.Formateur;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Formateur")
@AllArgsConstructor
public class FormateurController {


    private final FormateurService formateurService;

    @PostMapping("/creer")
    public Formateur creer(@RequestBody Formateur formateur)
    {

        return formateurService.create(formateur);
    }
    @GetMapping("/lire")
    public List<Formateur> lire(){
        return formateurService.read();

    }
    @PutMapping("/modifier/{id}")
    public Formateur modifier(@PathVariable Long id, @RequestBody Formateur formateur){
        return formateurService.update(id,formateur);


    }
    @DeleteMapping("/supprimer")
    public String supprimer(@PathVariable Long id){
        return formateurService.delete(id);

    }
}
