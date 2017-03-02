package com.cloud.modules.student.entity;

import com.cloud.common.BaseEntity;

/**
 * Created by lisu on 2017/3/2.
 */
public class Student extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Integer studentId;
    private String studentName;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
