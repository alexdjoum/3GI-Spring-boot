package com.example.demo.Service;
import com.example.demo.model.Lesson;
import java.util.*;
public interface LessonService {

    Lesson create(Lesson lesson);
    List<Lesson> read();
    Lesson update(Long id,Lesson lesson);
    String delete(Long id);
}
