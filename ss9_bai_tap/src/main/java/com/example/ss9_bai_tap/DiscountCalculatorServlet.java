package com.example.ss9_bai_tap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "helloServlet", value = "/admin")
public class DiscountCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("description");
        double price = Double.parseDouble(req.getParameter("price"));
        double  percent = Double.parseDouble(req.getParameter("percent"));
        double discountAmount = price*percent*0.01;
        double discountPrice = price - discountAmount;
        req.setAttribute("discountAmount",discountAmount);
        req.setAttribute("discountPrice",discountPrice);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/result.jsp");
        requestDispatcher.forward(req,resp);
    }

}