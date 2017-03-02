package com.cloud.modules.student.service;

import com.cloud.common.CurdService;
import com.cloud.modules.student.dao.StudentDao;
import com.cloud.modules.student.entity.Student;
import org.springframework.stereotype.Service;

/**
 * Created by lisu on 2017/3/2.
 */
@Service
public class StudentService extends CurdService<StudentDao, Student> {

    public Student studentInfo(String studentId) {
        return dao.findById(studentId);
    }
}
