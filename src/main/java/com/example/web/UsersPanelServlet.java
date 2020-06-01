package com.example.web;

import com.example.Utils.DatabaseConnection;
import com.example.Utils.Query;
import com.example.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UsersPanelServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            Connection conn = DatabaseConnection.initializeConnection();
            List<User> users = Query.retrieveAllUsers(conn);
            request.setAttribute("users", users);
            RequestDispatcher view = request.getRequestDispatcher("/userpanel.jsp");
            view.forward(request, response);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }
}
