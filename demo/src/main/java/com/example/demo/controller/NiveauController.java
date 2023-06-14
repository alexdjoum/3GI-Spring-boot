package com.example.demo.controller;

import com.example.demo.Service.NiveauService;
import lombok.AllArgsConstructor;
import com.example.demo.model.Niveau;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Niveau")
@AllArgsConstructor
public class NiveauController {

    private final NiveauService niveauService;

    @PostMapping("/creer")
    public Niveau creer(@RequestBody Niveau niveau)
    {

        return niveauService.create(niveau);
    }
    @GetMapping("/lire")
    public List<Niveau> lire(){
        return niveauService.read();

    }
    @PutMapping("/modifier/{id}")
    public Niveau modifier(@PathVariable Long id, @RequestBody Niveau niveau){
        return niveauService.update(id,niveau);


    }
    @DeleteMapping("/supprimer")
    public String supprimer(@PathVariable Long id){
        return niveauService.delete(id);

    }
}
