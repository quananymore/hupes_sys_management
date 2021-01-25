package com.hupes.model;

public class Scores {
    private String studentId;
    private float philosophy;
    private float physiologic;
    private float measure;
    private float scientificResearch;
    private float sportTheoryMethod;
    private float sportShoolTheoryMethod;
    private float specialize1 ;
    private float specialize2;
    private float sportsMedicine;
    private float sportManagement;
    private float sportEconomics;
    private float sportTalentSelection;
    private float sportPsychology;
    private int foreignLanguage;
    private float averageScore;

    public Scores(String studentId, float philosophy, float physiologic, float measure, float scientificResearch, float sportTheoryMethod, float sportShoolTheoryMethod, float specialize1, float specialize2, float sportsMedicine, float sportManagement, float sportEconomics, float sportTalentSelection, float sportPsychology, int foreignLanguage, float averageScore) {
        this.studentId = studentId;
        this.philosophy = philosophy;
        this.physiologic = physiologic;
        this.measure = measure;
        this.scientificResearch = scientificResearch;
        this.sportTheoryMethod = sportTheoryMethod;
        this.sportShoolTheoryMethod = sportShoolTheoryMethod;
        this.specialize1 = specialize1;
        this.specialize2 = specialize2;
        this.sportsMedicine = sportsMedicine;
        this.sportManagement = sportManagement;
        this.sportEconomics = sportEconomics;
        this.sportTalentSelection = sportTalentSelection;
        this.sportPsychology = sportPsychology;
        this.foreignLanguage = foreignLanguage;
        this.averageScore = averageScore;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public float getPhilosophy() {
        return philosophy;
    }

    public void setPhilosophy(float philosophy) {
        this.philosophy = philosophy;
    }

    public float getPhysiologic() {
        return physiologic;
    }

    public void setPhysiologic(float physiologic) {
        this.physiologic = physiologic;
    }

    public float getMeasure() {
        return measure;
    }

    public void setMeasure(float measure) {
        this.measure = measure;
    }

    public float getScientificResearch() {
        return scientificResearch;
    }

    public void setScientificResearch(float scientificResearch) {
        this.scientificResearch = scientificResearch;
    }

    public float getSportTheoryMethod() {
        return sportTheoryMethod;
    }

    public void setSportTheoryMethod(float sportTheoryMethod) {
        this.sportTheoryMethod = sportTheoryMethod;
    }

    public float getSportShoolTheoryMethod() {
        return sportShoolTheoryMethod;
    }

    public void setSportShoolTheoryMethod(float sportShoolTheoryMethod) {
        this.sportShoolTheoryMethod = sportShoolTheoryMethod;
    }

    public float getSpecialize1() {
        return specialize1;
    }

    public void setSpecialize1(float specialize1) {
        this.specialize1 = specialize1;
    }

    public float getSpecialize2() {
        return specialize2;
    }

    public void setSpecialize2(float specialize2) {
        this.specialize2 = specialize2;
    }

    public float getSportsMedicine() {
        return sportsMedicine;
    }

    public void setSportsMedicine(float sportsMedicine) {
        this.sportsMedicine = sportsMedicine;
    }

    public float getSportManagement() {
        return sportManagement;
    }

    public void setSportManagement(float sportManagement) {
        this.sportManagement = sportManagement;
    }

    public float getSportEconomics() {
        return sportEconomics;
    }

    public void setSportEconomics(float sportEconomics) {
        this.sportEconomics = sportEconomics;
    }

    public float getSportTalentSelection() {
        return sportTalentSelection;
    }

    public void setSportTalentSelection(float sportTalentSelection) {
        this.sportTalentSelection = sportTalentSelection;
    }

    public float getSportPsychology() {
        return sportPsychology;
    }

    public void setSportPsychology(float sportPsychology) {
        this.sportPsychology = sportPsychology;
    }

    public int getForeignLanguage() {
        return foreignLanguage;
    }

    public void setForeignLanguage(int foreignLanguage) {
        this.foreignLanguage = foreignLanguage;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }
}
