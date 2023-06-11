package Service;
import model.Evaluation;
import model.Lesson;
import java.util.*;
public interface LessonService {

    Lesson create(Lesson lesson);
    List<Lesson> read();
    Lesson update(Long id,Lesson lesson);
    String delete(Long id);
}
