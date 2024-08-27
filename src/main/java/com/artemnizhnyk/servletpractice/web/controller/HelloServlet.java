package com.artemnizhnyk.servletpractice.web.controller;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(urlPatterns = {"/helloServlet"})
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    @Override
    public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        String enteredValue;
        enteredValue = req.getParameter("enteredValue");
        resp.setContentType("text/html");
        PrintWriter printWriter;
        try {
            printWriter = resp.getWriter();
            printWriter.println("<p>");
            printWriter.print("You entered: ");
            printWriter.print(enteredValue);
            printWriter.print("</p>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
    }
}