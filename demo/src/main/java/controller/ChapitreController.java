package controller;

import Service.ChapitreService;
import lombok.AllArgsConstructor;
import model.Chapitre;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Chapitre")
@AllArgsConstructor
public class ChapitreController {

    private final ChapitreService chapitreService;

    @PostMapping("/creer")
    public Chapitre creer(@RequestBody Chapitre chapitre)
    {

        return chapitreService.create(chapitre);
    }
    @GetMapping("/lire")
    public List<Chapitre> lire (){

        return chapitreService.read();

    }
    @PutMapping("/modifier/{id}")
    public Chapitre modifier(@PathVariable Long id, @RequestBody Chapitre chapitre)
    {
        return chapitreService.update(id,chapitre);

    }
    @DeleteMapping("/supprimer")
    public String supprimer(@PathVariable Long id){
        return chapitreService.delete(id);

    }
}
