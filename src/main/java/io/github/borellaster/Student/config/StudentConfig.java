package io.github.borellaster.Student.config;

import io.github.borellaster.Student.domain.Student;
import io.github.borellaster.Student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student felipe = new Student(
                    "Felipe", "Borella", "borellaster@gmail.com", LocalDate.of(1985, Month.FEBRUARY, 10)
            );

            studentRepository.saveAll(
                    List.of(felipe)
            );
        };
    }
}
