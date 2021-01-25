package com.hupes.controller;

import com.hupes.ReadExcel;
import com.hupes.model.Student;

import java.util.List;

public class MainPro {
     
    public static void main(String[] args) {
        try {
             
            //String excelFilePath = "D:/JAVA/DataSamples/books_1.xls";
            String excelFilePath = "C:/Users/Admin/Desktop/demo/student.xlsx";

            List<Student> students  = new ReadExcel().ReadStudentFromExcel(excelFilePath);
            StudentDAO studentDAO = new StudentDAO();
            studentDAO.importStudent(students);
             
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }
     
}