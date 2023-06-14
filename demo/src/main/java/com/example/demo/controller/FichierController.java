package com.example.demo.controller;

import com.example.demo.Service.FichierService;
import lombok.AllArgsConstructor;
import com.example.demo.model.Fichier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Fichier")
@AllArgsConstructor
public class FichierController {


    private final FichierService fichierService;

    @PostMapping("/creer")
    public Fichier creer(@RequestBody Fichier fichier)
    {

        return fichierService.create(fichier);
    }
    @GetMapping("/lire")
    public List<Fichier> lire(){
        return fichierService.read();

    }
    @PutMapping("/modifier/{id}")
    public Fichier modifier(@PathVariable Long id, @RequestBody Fichier fichier){
        return fichierService.update(id,fichier);


    }
    @DeleteMapping("/supprimer")
    public String supprimer(@PathVariable Long id){
        return fichierService.delete(id);

    }


}
