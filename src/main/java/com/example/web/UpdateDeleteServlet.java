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

public class UpdateDeleteServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        if (request.getParameter("butonUpdate") != null) {
            try {
                Connection conn = DatabaseConnection.initializeConnection();
                int id = Integer.parseInt(request.getParameter("butonUpdate"));
                User user = Query.searchById(id, conn);
                request.setAttribute("id", id);
                request.setAttribute("user", user);
                RequestDispatcher view = request.getRequestDispatcher("updateform.jsp");
                view.forward(request, response);
            } catch (ClassNotFoundException | SQLException | ServletException ex) {
                ex.printStackTrace();
            }
            // updateUser();
        } else if (request.getParameter("butonDelete") != null) {
            try {
                Connection conn = DatabaseConnection.initializeConnection();
                int id = Integer.parseInt(request.getParameter("butonDelete"));
                String message = Query.deleteUser(id, conn);
                request.setAttribute("userdeleted", message);
                RequestDispatcher view = request.getRequestDispatcher("userdeleted.jsp");
                view.forward(request, response);
            } catch (ClassNotFoundException | SQLException | ServletException ex) {
                ex.printStackTrace();
            }
        }

    }

}
