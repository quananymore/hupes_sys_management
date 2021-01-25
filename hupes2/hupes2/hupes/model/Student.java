package com.hupes.model;

import java.sql.Date;

public class Student {
    private String studentId;
    private String studentName;
    private String gender;
    private String dateBirth;

    public Student() {}

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Student(String studentId, String studentName, String gender, String dateBirth) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.dateBirth = dateBirth;
    }
}
