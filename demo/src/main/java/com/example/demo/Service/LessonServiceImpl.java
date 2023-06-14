package com.example.demo.Service;

import lombok.AllArgsConstructor;
import com.example.demo.model.Lesson;
import org.springframework.stereotype.Service;
import com.example.demo.repository.LessonRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class LessonServiceImpl implements LessonService {

    private final LessonRepository lessonRepository;

    @Override
    public Lesson create(Lesson lesson) {
        return lessonRepository.save(lesson);
    }

    @Override
    public List<Lesson> read() {
        return lessonRepository.findAll();
    }

    @Override
    public Lesson update(Long id, Lesson lesson) {
        return lessonRepository.findById(id)
                .map(less->{
                    less.setDuration(lesson.getDuration());
                    less.setTitle(lesson.getTitle());
                    less.setLesson_order(lesson.getLesson_order());
                    less.setVideo_url(lesson.getVideo_url());
                    less.setChapter_id(lesson.getChapter_id());
                    less.setChapter_id(lesson.getChapter_id());
                    return lessonRepository.save(less);

                }).orElseThrow(()->new RuntimeException("Lesson inexistante ! "));
    }

    @Override
    public String delete(Long id) {
        lessonRepository.deleteById(id);
        return "Lesson supprimée";
    }
}
