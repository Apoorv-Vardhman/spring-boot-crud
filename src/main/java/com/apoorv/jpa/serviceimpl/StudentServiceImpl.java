package com.apoorv.jpa.serviceimpl;

import com.apoorv.jpa.entities.Student;
import com.apoorv.jpa.repositories.StudentRepository;
import com.apoorv.jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLIntegrityConstraintViolationException;
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

    @Override
    public Student findByEmail(String email) {
        List<Student> students = studentRepository.findByEmailID(email);
        if(students.size()==0)
        {
            return null;
        }
        else
        {
            return students.get(0);
        }
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(Student student) {
        studentRepository.delete(student);
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow(()->new RuntimeException("Resource not found with "+id));
    }
}
