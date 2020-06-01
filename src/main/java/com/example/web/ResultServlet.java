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
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

public class ResultServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        RequestDispatcher view;
        Connection conn;
        if (request.getParameter("searchId") != null) {
            try {
                conn = DatabaseConnection.initializeConnection();
                int id = Integer.parseInt(request.getParameter("searchId"));
                User user = Query.searchById(id, conn);
                request.setAttribute("user", user);

                view = request.getRequestDispatcher("afterIdSearch.jsp");
                view.forward(request, response);
                conn.close();
            } catch (ClassNotFoundException | SQLException | ServletException ex) {
                ex.printStackTrace();
            }
        } else if (request.getParameter("searchEmail") != null) {
            try {
                conn = DatabaseConnection.initializeConnection();
                String email = request.getParameter("searchEmail");
                User user = Query.searchByEmail(email, conn);
                request.setAttribute("user", user);

                view = request.getRequestDispatcher("afterEmailSearch.jsp");
                view.forward(request, response);
                conn.close();
            } catch (ClassNotFoundException | SQLException | ServletException ex) {
                ex.printStackTrace();
            }
        }
    }
}
