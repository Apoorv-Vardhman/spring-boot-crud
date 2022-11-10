package com.apoorv.jpa.serviceimpl;

import com.apoorv.jpa.entities.Student;
import com.apoorv.jpa.repositories.StudentRepository;
import com.apoorv.jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Apoorv Vardhman
 * @Github Apoorv-Vardhman
 * @LinkedIN apoorv-vardhman
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
}
