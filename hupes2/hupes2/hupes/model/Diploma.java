package com.hupes.model;

public class Diploma {
    private String diplomaId;
    private String originalId;
    private String studentId;

    public String getDiplomaId() {
        return diplomaId;
    }

    public void setDiplomaId(String diplomaId) {
        this.diplomaId = diplomaId;
    }

    public String getOriginalId() {
        return originalId;
    }

    public void setOriginalId(String originalId) {
        this.originalId = originalId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Diploma(String diplomaId, String originalId, String studentId) {
        this.diplomaId = diplomaId;
        this.originalId = originalId;
        this.studentId = studentId;
    }
}
