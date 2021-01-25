package com.hupes.controller;

import com.hupes.connection.MySQLConnection;
import com.hupes.model.Student;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentDAO {

    private Connection conn;
    private PreparedStatement ps;

    public void importStudent(List<Student> listStudents){
        try {
            conn = MySQLConnection.connect();
            conn.setAutoCommit(false);

            String sql = "INSERT INTO student(student_id,student_name,gender,date_birth) VALUES (?,?,?,?)";
            ps = conn.prepareStatement(sql);

            for (Student student : listStudents){
                ps. setString(1,student.getStudentId());
                ps.setString(2,student.getStudentName());
                ps.setString(3,student.getGender());
                ps.setString(4, student.getDateBirth());
            }
            //excute
            ps.execute();
            conn.close();

        } catch (Exception exception) {
            exception.printStackTrace();
            MySQLConnection.rollbackQuietly(conn);
        }finally {
            try{
                if(ps !=null){
                    ps.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            MySQLConnection.disconnect(conn);
        }
    }
}
