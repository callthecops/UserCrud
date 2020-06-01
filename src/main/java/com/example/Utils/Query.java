package com.example.Utils;

import com.example.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Query {

    public static String insertUser(User user, Connection conn) throws SQLException {
        PreparedStatement pStmnt = conn.prepareStatement("insert into userTable(first_name,last_name,e_mail,age,gender) values(?,?,?,?,?)");

        pStmnt.setString(1, user.getFirstName());
        pStmnt.setString(2, user.getLastName());
        pStmnt.setString(3, user.geteMail());
        pStmnt.setInt(4, user.getAge());
        pStmnt.setString(5, user.getGender());

        pStmnt.executeUpdate();
        pStmnt.close();
        conn.close();

        return "User has been added to the database";
    }

    public static User searchById(int id, Connection conn) throws SQLException {

        String query = "select id,first_name,last_name,e_mail,age,gender from usertable where id=(?)";
        PreparedStatement pstmnt = conn.prepareStatement(query);
        pstmnt.setInt(1, id);
        User user = null;
        ResultSet rs = pstmnt.executeQuery();
        while (rs.next()) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            String eMail = rs.getString("e_mail");
            int age = rs.getInt("age");
            String gender = rs.getString("gender");
            int iD = rs.getInt("id");
            user = new User(firstName, lastName, gender, eMail, age, iD);
        }

        return user;
    }

    public static User searchByEmail(String email, Connection conn) throws SQLException {
        String query = "select id,first_name,last_name,e_mail,age,gender from usertable where e_mail=(?)";
        PreparedStatement pstmnt = conn.prepareStatement(query);
        pstmnt.setString(1, email);

        User user = null;
        ResultSet rs = pstmnt.executeQuery();
        while (rs.next()) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            String eMail = rs.getString("e_mail");
            int age = rs.getInt("age");
            String gender = rs.getString("gender");
            int iD = rs.getInt("id");
            user = new User(firstName, lastName, gender, eMail, age, iD);
        }
        return user;

    }

    public static List<User> retrieveAllUsers(Connection conn) throws SQLException {
        String query = "select * from usertable";
        PreparedStatement pstmnt = conn.prepareStatement(query);
        List<User> userList = new ArrayList<>();
        User user;
        ResultSet rs = pstmnt.executeQuery();

        while (rs.next()) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            String eMail = rs.getString("e_mail");
            int age = rs.getInt("age");
            String gender = rs.getString("gender");
            int iD = rs.getInt("id");
            user = new User(firstName, lastName, gender, eMail, age, iD);
            userList.add(user);
        }
        return userList;
    }

    public static String deleteUser(int id, Connection conn) throws SQLException {
        String query = "delete from usertable where id=(?)";
        PreparedStatement pstmnt = conn.prepareStatement(query);
        pstmnt.setInt(1, id);
        pstmnt.executeUpdate();
        conn.close();

        return "User has been deleted";
    }

    public static String updateUser(User user, int id, Connection conn) throws SQLException {

        String query = "update usertable set first_name = ?, last_name = ?, e_mail= ?, age = ?, gender = ? where id = ?;";

        PreparedStatement pstmnt = conn.prepareStatement(query);

        pstmnt.setString(1, user.getFirstName());
        pstmnt.setString(2, user.getLastName());
        pstmnt.setString(3, user.geteMail());
        pstmnt.setInt(4, user.getAge());
        pstmnt.setString(5, user.getGender());

        pstmnt.setInt(6, id);

        pstmnt.executeUpdate();
        conn.close();

        return "User has been updated ";
    }


}

