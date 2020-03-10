package com.controller;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/controller")
public class Main extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Logger logger = LogManager.getLogger();
        logger.log(Level.INFO,"Reading lines of numbers");
        String number1Str = request.getParameter("num1");
        String number2Str = request.getParameter("num2");

        logger.log(Level.INFO,"Parsing lines to int numbers");
        int number1 = Integer.parseInt(number1Str);
        int number2 = Integer.parseInt(number2Str);

        logger.log(Level.INFO,"Calculating result");
        int result = number1 + number2;

        request.setAttribute("res", result);
        request.getRequestDispatcher("/pages/main.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
