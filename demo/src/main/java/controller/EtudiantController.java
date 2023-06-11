package controller;

import Service.EtudiantService;
import lombok.AllArgsConstructor;
import model.Etudiant;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/Etudiant")
@AllArgsConstructor
public class EtudiantController {

    private final EtudiantService etudiantService;

    @PostMapping("/creer")
    public Etudiant creer(@RequestBody Etudiant etudiant)
    {

        return etudiantService.create(etudiant);
    }
    @GetMapping("/lire")
    public List<Etudiant> lire (){

        return etudiantService.read();

    }
    @PutMapping("/modifier/{id}")
    public Etudiant modifier(@PathVariable Long id, @RequestBody Etudiant etudiant)
    {
        return etudiantService.update(id,etudiant);

    }
    @DeleteMapping("/supprimer")
    public String supprimer(@PathVariable Long id){
        return etudiantService.delete(id);

    }
}
