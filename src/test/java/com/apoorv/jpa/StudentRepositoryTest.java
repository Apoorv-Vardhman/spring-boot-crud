package com.apoorv.jpa;

import com.apoorv.jpa.entities.Student;
import com.apoorv.jpa.repositories.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author Apoorv Vardhman
 * @Github Apoorv-Vardhman
 * @LinkedIN apoorv-vardhman
 */
@SpringBootTest
public class StudentRepositoryTest {
    @Autowired
    StudentRepository repository;

    @Test
    public void createStudent()
    {
        Student student = Student.builder()
                .emailID("apoorv@gmail.com")
                .firstName("Apoorv")
                .lastName("Vardhman")
                .build();
        repository.save(student);
    }

    @Test
    public void allStudent()
    {
        List<Student> students = repository.findAll();
        System.out.println("student list "+students);
    }
}
