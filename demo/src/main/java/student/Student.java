package student;

import java.time.LocalDate;

public class Student {
    private long id;
    private String name;
    private LocalDate dov;
    private Integer age;
    private String email;

    public Student(long id, String name, LocalDate dov, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.dov = dov;
        this.age = age;
        this.email = email;
    }

    public Student() {
    }

    public Student(String name, LocalDate dov, Integer age, String email) {
        this.name = name;
        this.dov = dov;
        this.age = age;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDov() {
        return dov;
    }

    public void setDov(LocalDate dov) {
        this.dov = dov;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
