package com.example.demo.controller;


import com.example.demo.Service.SousSystemeService;
import lombok.AllArgsConstructor;
import com.example.demo.model.SousSysteme;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/SousSysteme")
@AllArgsConstructor
public class SousSystemeController {

    private final SousSystemeService sousSystemeService;

    @PostMapping("/creer")
    public SousSysteme creer(@RequestBody SousSysteme sousSysteme)
    {

        return sousSystemeService.create(sousSysteme);
    }
    @GetMapping("/lire")
    public List<SousSysteme> lire(){
        return sousSystemeService.read();

    }
    @PutMapping("/modifier/{id}")
    public SousSysteme modifier(@PathVariable Long id, @RequestBody SousSysteme sousSysteme){
        return sousSystemeService.update(id,sousSysteme);


    }
    @DeleteMapping("/supprimer")
    public String supprimer(@PathVariable Long id){
        return sousSystemeService.delete(id);

    }
}
