package controller;

import Service.FormationService;
import lombok.AllArgsConstructor;
import model.Formation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Formation")
@AllArgsConstructor
public class FormationController {

    private final FormationService formationService;

    @PostMapping("/creer")
    public Formation creer(@RequestBody Formation formation)
    {

        return formationService.create(formation);
    }
    @GetMapping("/lire")
    public List<Formation> lire(){
        return formationService.read();

    }
    @PutMapping("/modifier/{id}")
    public Formation modifier(@PathVariable Long id, @RequestBody Formation formation){
        return formationService.update(id,formation);


    }
    @DeleteMapping("/supprimer")
    public String supprimer(@PathVariable Long id){
        return formationService.delete(id);

    }
}
