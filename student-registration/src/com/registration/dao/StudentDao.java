package com.registration.dao;

import java.sql.*;
import com.registration.model.Student;

public class StudentDao {
	public int registerStudent(Student student) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO STUDENT" +
            "  (id, firstname, lastname, username, password, contact, department) VALUES " +
            " (?, ?, ?, ?, ?,?,?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false", "root", "root");

            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, student.getFirstName());
            preparedStatement.setString(3, student.getLastName());
            preparedStatement.setString(4, student.getUsername());
            preparedStatement.setString(5, student.getPassword());
            preparedStatement.setString(6, student.getContact());
            preparedStatement.setString(7, student.getDepartment());

            System.out.println(preparedStatement);
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            e.printStackTrace();
        }
        return result;
    }
}
