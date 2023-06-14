package com.example.demo.controller;

import com.example.demo.Service.CycleService;
import lombok.AllArgsConstructor;
import com.example.demo.model.Cycle;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cycle")
@AllArgsConstructor
public class CycleConcroller {

    private final CycleService cycleService;

    @PostMapping("/creer")
    public Cycle creer(@RequestBody Cycle cycle)
    {

        return cycleService.create(cycle);
    }
    @GetMapping("/lire")
    public List<Cycle> lire(){
        return cycleService.read();

    }
    @PutMapping("/modifier/{id}")
    public Cycle modifier(@PathVariable Long id, @RequestBody Cycle cycle){
        return cycleService.update(id,cycle);


    }
    @DeleteMapping("/supprimer")
    public String supprimer(@PathVariable Long id){
        return cycleService.delete(id);

    }
}
