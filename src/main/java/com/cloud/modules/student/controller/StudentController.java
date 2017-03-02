package com.cloud.modules.student.controller;

import com.cloud.modules.student.entity.Student;
import com.cloud.modules.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lisu on 2017/3/2.
 */
@RestController
@RequestMapping(value = "student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "studentInfo")
    public Student studentInfo(String studentId) {
        return studentService.studentInfo(studentId);
    }
}
