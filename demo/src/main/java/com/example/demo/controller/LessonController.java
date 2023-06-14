package com.example.demo.controller;


import com.example.demo.Service.LessonService;
import lombok.AllArgsConstructor;
import com.example.demo.model.Lesson;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Lesson")
@AllArgsConstructor
public class LessonController {

    private final LessonService lessonService;

    @PostMapping("/creer")
    public Lesson creer(@RequestBody Lesson lesson)
    {

        return lessonService.create(lesson);
    }
    @GetMapping("/lire")
    public List<Lesson> lire(){
        return lessonService.read();

    }
    @PutMapping("/modifier/{id}")
    public Lesson modifier(@PathVariable Long id, @RequestBody Lesson lesson){
        return lessonService.update(id,lesson);


    }
    @DeleteMapping("/supprimer")
    public String supprimer(@PathVariable Long id){
        return lessonService.delete(id);

    }
}
