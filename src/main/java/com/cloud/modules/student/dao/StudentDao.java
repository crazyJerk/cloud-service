package com.cloud.modules.student.dao;

import com.cloud.common.CurdDao;
import com.cloud.modules.student.entity.Student;
import org.springframework.cache.annotation.Cacheable;

/**
 * Created by lisu on 2017/3/2.
 */
public interface StudentDao extends CurdDao<Student> {

    @Cacheable("student")
    Student findById(String studentId);
}
