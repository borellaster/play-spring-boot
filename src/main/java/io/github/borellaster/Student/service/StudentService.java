package io.github.borellaster.Student.service;

import io.github.borellaster.Student.domain.Student;
import io.github.borellaster.Student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }


    public List<Student> findAll(){
        return studentRepository.findAll();
        /*return List.of(
                new Student(
                        1L,"Felipe", "Borella", "borellaster@gmail.com", LocalDate.of(1985, Month.FEBRUARY, 10)
                ),
                new Student(
                        1L,"Luccas", "Perone" ,"luccasperone@gmail.com", LocalDate.of(1990, Month.AUGUST, 5)
                )
        );*/
    }
}
