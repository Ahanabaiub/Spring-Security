package com.company.practiceAPI.student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagerController {
    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Ahamed Ryhan"),
            new Student(2, "Jhon Doe"),
            new Student(3, "Turag Moin")
    );

    @GetMapping
    public List<Student> getStudents(){
        return STUDENTS;
    }

    @PostMapping
    public void registerStudent(@RequestBody Student student){
        System.out.print("registerStudent :");
        System.out.println(student);
    }

    @PutMapping("{studentId}")
    public void updateStudent(@PathVariable("studentId") Integer studentId, Student student){
        System.out.print("updateStudent :");
        System.out.println(student);
    }

    @DeleteMapping("{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println("deleteStudent : "+studentId);
    }
}
