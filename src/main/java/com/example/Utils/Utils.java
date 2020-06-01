package com.example.Utils;

import com.example.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Utils {

    // fetches User information based on the input.Returns values as a map.
    public static User fetchUserInput(HttpServletRequest request) {
        User user = new User();

        user.setFirstName(request.getParameter("firstName"));
        user.setLastName(request.getParameter("lastName"));
        user.seteMail(request.getParameter("eMail"));
        user.setAge(Integer.parseInt(request.getParameter("age")));
        user.setGender(request.getParameter("gender"));

        return user;
    }

    public static void searchBy(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String searchType = request.getParameter("searchType");
        RequestDispatcher view;

        switch (searchType) {
            case "ById"://
                view = request.getRequestDispatcher("searchbyid.html");
                view.forward(request, response);
                break;
            case "ByEmail"://
                view = request.getRequestDispatcher("searchbyemail.html");
                view.forward(request, response);
                break;
        }
    }



}
