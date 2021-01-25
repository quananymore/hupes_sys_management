package com.hupes.model;

import java.util.Date;

public class Council {
    private String studentId;
    private String chairMan;
    private String secretary;
    private String councilman;

    public Council(String studentId, String chairMan, String secretary, String councilman) {
        this.studentId = studentId;
        this.chairMan = chairMan;
        this.secretary = secretary;
        this.councilman = councilman;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getChairMan() {
        return chairMan;
    }

    public void setChairMan(String chairMan) {
        this.chairMan = chairMan;
    }

    public String getSecretary() {
        return secretary;
    }

    public void setSecretary(String secretary) {
        this.secretary = secretary;
    }

    public String getCouncilman() {
        return councilman;
    }

    public void setCouncilman(String councilman) {
        this.councilman = councilman;
    }
}
