package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Установка типа контента
        response.setContentType("text/html;charset=UTF-8");

        // Получение объекта PrintWriter для отправки ответа
        PrintWriter out = response.getWriter();

        // Отправка простого HTML-ответа
        out.println("<html>");
        out.println("<head><title>Приветствие</title></head>");
        out.println("<body>");
        out.println("<h1>Привет, мир!</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Установка типа контента
        response.setContentType("text/html;charset=UTF-8");

        // Получение параметра из запроса
        String username = request.getParameter("username");

        // Получение объекта PrintWriter для отправки ответа
        PrintWriter out = response.getWriter();

        // Отправка персонализированного приветствия
        out.println("<html>");
        out.println("<head><title>Приветствие</title></head>");
        out.println("<body>");
        out.println("<h1>Привет, " + username + "!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
