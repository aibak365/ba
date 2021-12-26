package student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Component
public class StudentService {
    public List<Student> getStudent()
    {
        return List.of(
                new Student(
                        1L,
                        "Aibak", LocalDate.of(2000, Month.APRIL,4),21,"aibak@gmail.com"
                )
        );
    }
}
