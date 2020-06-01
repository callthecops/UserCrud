package com.example.web;

import com.example.Utils.Utils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SearchServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String value = request.getParameter("searchType");
        RequestDispatcher view;
        if(value.equals("ById")){
            view = request.getRequestDispatcher("searchbyid.html");
            view.forward(request, response);
        }else{
            view = request.getRequestDispatcher("searchbyemail.html");
            view.forward(request, response);
        }

        Utils.searchBy(request, response);


    }
}
