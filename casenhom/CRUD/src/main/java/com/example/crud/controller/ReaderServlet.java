package com.example.crud.controller;

import com.example.crud.model.Reader;
import com.example.crud.service.IReaderService;
import com.example.crud.service.impl.ReaderServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import java.util.List;

@WebServlet(name = "helloServlet", value = "/reader")
public class ReaderServlet extends HttpServlet {
    private IReaderService readerService = new ReaderServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            default:
                listReader(req, resp);
        }
    }

    private void listReader(HttpServletRequest req, HttpServletResponse resp) {
        List<Reader> list = readerService.listReadable();
        req.setAttribute("list", list);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view_reader/list.jsp");

    }
}