package com.apoorv.jpa.controller;

import com.apoorv.jpa.entities.Student;
import com.apoorv.jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Apoorv Vardhman
 * @Github Apoorv-Vardhman
 * @LinkedIN apoorv-vardhman
 */
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public @ResponseBody Object students()
    {
        return studentService.findAllStudents();
    }

    @PostMapping("students")
    public @ResponseBody Object create(@RequestBody Student student)
    {
        return studentService.createStudent(student);
    }
}
