package aibak.aibak.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Component
public class StudentService {
    public  List<Student> getStudents()
    {
        return List.of(
                new Student(
                        1l,
                        "aibak",
                        "aibak@gmail.com",
                        LocalDate.of(2001, Month.FEBRUARY,2),
                        21
                )
        );
    }
}
