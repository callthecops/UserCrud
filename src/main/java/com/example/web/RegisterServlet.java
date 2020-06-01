package com.example.web;

import com.example.Utils.DatabaseConnection;
import com.example.Utils.Query;
import com.example.Utils.Utils;
import com.example.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        // Fetching all user input information
        User user = Utils.fetchUserInput(request);
        // Creating a Connection
        Connection conn;
        try {
            conn = DatabaseConnection.initializeConnection();
            String success = Query.insertUser(user, conn);
            request.setAttribute("success", success);
            RequestDispatcher view = request.getRequestDispatcher("success.jsp");
            view.forward(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}
