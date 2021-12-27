package aibak.aibak.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentControll {
    private final StudentService studentService;

    public StudentControll(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getStudents()
    {
        return studentService.getStudents();
    }
    @PostMapping
    public void register(@RequestBody Student student)
    {
        StudentService.addNewStudent(student);
    }
    @DeleteMapping(path= "{studentId}")
    public void delete(@PathVariable("studentId") Long id)
    {
        studentService.deleteStudent(id);
    }
    @PutMapping(path ="{studentId}")
    public void update(@PathVariable("studentId") Long studentId,@RequestParam(required = false)String name,@RequestParam(required = false)String email)
    {
        studentService.updateStudent(studentId,name,email);
    }
}
