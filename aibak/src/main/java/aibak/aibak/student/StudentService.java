package aibak.aibak.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class StudentService {
    private final StudentRepostitry studentRepostitry;
    @Autowired
    public StudentService(StudentRepostitry studentRepostitry) {
        this.studentRepostitry = studentRepostitry;
    }

    public static void addNewStudent(Student student) {

    }

    public  List<Student> getStudents()
    {
        return studentRepostitry.findAll();
    }
    public void addNewStudents(Student student)
    {
        Optional<Student> studentOptional=studentRepostitry.findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent())
        {
            throw new IllegalStateException("No duplicate");
        }
        studentRepostitry.save(student);
    }

    public void deleteStudent(long id) {
        boolean check=studentRepostitry.existsById(id);
        if(!check)
        {
            throw new IllegalStateException("NO user with this id "+id);

        }
        else
        {
            studentRepostitry.deleteById(id);
        }
    }
    @Transactional
    public void updateStudent(Long studentId, String name, String email) {
        Student student = studentRepostitry.findById(studentId).orElseThrow(() -> new IllegalStateException("whhat this ID???"));
        if (name != null && name.length() > 0 && !Objects.equals(student.getName(), name)) {
            student.setName(name);
        }
        if (email != null && email.length() > 0 && !Objects.equals(student.getEmail(), email)) {
            Optional<Student> studentOptional = studentRepostitry.findStudentByEmail(email);
            if (studentOptional.isPresent())
            {
                throw new IllegalStateException("WHAT this email dude !!!!!");
            }
                student.setEmail(email);
        }
    }
}
