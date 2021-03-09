package io.github.borellaster.Student.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long id;

    private String name;

    private String lastName;

    private String email;

    private LocalDate dob;

    public Student(String name, String lastName, String email, LocalDate dob){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
    }

    public Student(){
    }
}
