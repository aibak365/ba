package aibak.aibak.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepostitry repostitry)
    {
        return args ->
        {
            Student aibak=new Student(

                    "aibak"
                    ,"aibak@gmail.com"
                    , LocalDate.of(2001, Month.FEBRUARY,2)

            );
            Student ammar=new Student(

                    "ammar"
                    ,"ammar@gmail.com"
                    , LocalDate.of(2001, Month.FEBRUARY,2)

            );
            repostitry.saveAll(
                    List.of(aibak,ammar)
            );
        };
    }
}
