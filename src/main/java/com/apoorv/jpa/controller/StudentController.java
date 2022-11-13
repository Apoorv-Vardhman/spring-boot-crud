package com.apoorv.jpa.controller;

import com.apoorv.jpa.entities.Student;
import com.apoorv.jpa.response.AppResponse;
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
        if(studentService.findByEmail(student.getEmailID())==null)
        {
            return AppResponse.created(studentService.createStudent(student),"Student added");
        }
        else
        {
            return AppResponse.error("Email address already exist");
        }
    }

    @PatchMapping("students")
    public @ResponseBody Object update(@RequestBody Student data)
    {
        Student student = studentService.findById(data.getId());
        student.setFirstName(data.getFirstName());
        student.setLastName(data.getLastName());
        student = studentService.updateStudent(student);
        return AppResponse.success(student,"Student updated");
    }

    @DeleteMapping("students/{id}")
    public @ResponseBody Object delete(@PathVariable("id") Long id)
    {
        Student student = studentService.findById(id);
        studentService.delete(student);
        return AppResponse.noContent("Student deleted");
    }

    @GetMapping("students/{id}")
    public @ResponseBody Object getStudent(@PathVariable("id") Long id)
    {
        return AppResponse.success(studentService.findById(id),"Student Data");
    }
}
