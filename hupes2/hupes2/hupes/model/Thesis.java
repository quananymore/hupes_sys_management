package com.hupes.model;

public class Thesis {
    private String studentId;
    private String thesisName;
    private String instructor;

    public Thesis(String studentId, String thesisName, String instructor) {
        this.studentId = studentId;
        this.thesisName = thesisName;
        this.instructor = instructor;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getThesisName() {
        return thesisName;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
