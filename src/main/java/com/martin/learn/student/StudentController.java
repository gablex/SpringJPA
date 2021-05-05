/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.learn.student;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author admin
 * Resources for our controller
 */
@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {
//Create Reference to the student service layer
    
    private final StudentService studentService;
    
    @Autowired  //<--- This magically create instance of StudentService 
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

@GetMapping
public List<Student> getStudents(){
    return studentService.getStudents();
}

@PostMapping //<-- It is a post http request
//We are getting the student from the Request body
public void registerNewStudent(@RequestBody Student student){
    studentService.addNewStudent(student);
}

@DeleteMapping(path="{studentId}")
public void deleteStudent(@PathVariable("studentId") Long studentId){
    studentService.deleteStudent(studentId);
}

@PutMapping(path="{studentId}")
public void updateStudent(
@PathVariable("studentId") Long studentId,
        @RequestParam(required=false) String name,
        @RequestParam(required = false) String email){
    studentService.updateStudent(studentId,name,email);
}

}
