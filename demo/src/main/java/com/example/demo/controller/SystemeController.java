package com.example.demo.controller;


import com.example.demo.Service.SystemeService;
import lombok.AllArgsConstructor;
import com.example.demo.model.Systeme;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Systeme")
@AllArgsConstructor
public class SystemeController {

    private final SystemeService systemeService;

    @PostMapping("/creer")
    public Systeme creer(@RequestBody Systeme systeme)
    {

        return systemeService.create(systeme);
    }
    @GetMapping("/lire")
    public List<Systeme> lire(){
        return systemeService.read();

    }
    @PutMapping("/modifier/{id}")
    public Systeme modifier(@PathVariable Long id, @RequestBody Systeme systeme){
        return systemeService.update(id,systeme);


    }
    @DeleteMapping("/supprimer")
    public String supprimer(@PathVariable Long id){
        return systemeService.delete(id);

    }
}
