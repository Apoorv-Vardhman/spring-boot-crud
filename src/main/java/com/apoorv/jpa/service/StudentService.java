package com.apoorv.jpa.service;

import com.apoorv.jpa.entities.Student;

import java.util.List;

/**
 * @author Apoorv Vardhman
 * @Github Apoorv-Vardhman
 * @LinkedIN apoorv-vardhman
 */
public interface StudentService {
    List<Student> findAllStudents();
    Student createStudent(Student student);
}
