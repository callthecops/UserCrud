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

public class AfterUpdateDeleteServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User updateUser = Utils.fetchUserInput(request);
        int id = Integer.parseInt(request.getParameter("useridfordbsearch"));

        Connection conn;
        try {
            conn = DatabaseConnection.initializeConnection();
            String updated = Query.updateUser(updateUser, id, conn);
            request.setAttribute("update",updated);
            RequestDispatcher view = request.getRequestDispatcher("hasbeenupdated.jsp");
            view.forward(request,response);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }
}
