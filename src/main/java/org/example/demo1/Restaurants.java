package org.example.demo1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "restaurantsServlet", value = "/restaurants")
public class Restaurants extends HttpServlet
{
    public void init() {    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        getServletContext().getRequestDispatcher("/restaurants.jsp").forward(request, response);
    }


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

    }
    public void destroy() {
    }
}

