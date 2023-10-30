package com.example.bai1_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "customerServlet", value = "/customer-servlet")
public class CustomerServlet extends HttpServlet{
    private static List<Customer> customerList;

    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Phan Văn Toại", "2001-08-20", "Nghệ an", "https://i.pinimg.com/564x/8b/23/c4/8b23c4d6b42390f078d088b3115e5d0b.jpg"));
        customerList.add(new Customer(2, "Trần Gia Kiệt", "2003-08-21", "Quảng Bình", "https://i.pinimg.com/564x/8b/23/c4/8b23c4d6b42390f078d088b3115e5d0b.jpg"));
        customerList.add(new Customer(3, "Trần Anh Tuấn", "2005-08-22", "Đà Nẵng", "https://i.pinimg.com/564x/8b/23/c4/8b23c4d6b42390f078d088b3115e5d0b.jpg"));
        customerList.add(new Customer(4, "Hoàn Trần Văn Hiếu", "2001-08-17", "Huế", "https://i.pinimg.com/564x/8b/23/c4/8b23c4d6b42390f078d088b3115e5d0b.jpg"));
        customerList.add(new Customer(5, "Nguyễn Tất Quyền", "2002-08-19", "Quảng Ngãi", "https://i.pinimg.com/564x/8b/23/c4/8b23c4d6b42390f078d088b3115e5d0b.jpg"));
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList", customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/customer_list.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
