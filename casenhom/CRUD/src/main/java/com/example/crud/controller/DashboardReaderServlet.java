package com.example.crud.controller;

import com.example.crud.model.Reader;
import com.example.crud.service.IReaderService;
import com.example.crud.service.impl.ReaderServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "helloServlet",
        value = {
                "/dashboard/reader",
                "/dashboard/reader/add",
                "/dashboard/reader/detail",
                "/dashboard/reader/edit",
                "/dashboard/reader/remove",
        })
public class DashboardReaderServlet extends HttpServlet {
    private final IReaderService readerService = new ReaderServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = request.getRequestURI();
        if (url.endsWith("/dashboard/reader")) {
            showListReader(request, response);
        } else if (url.endsWith("/dashboard/reader/detail")) {
            showInfoReader(request, response);
        } else if (url.endsWith("/dashboard/reader/remove")) {
            removeReader(request, response);
        }
    }

    private void removeReader(HttpServletRequest request, HttpServletResponse response) {
        int idReader = Integer.parseInt(request.getParameter("id"));
        boolean status = readerService.removeReader(idReader);
        if (status == true) {
            try {
                response.sendRedirect("/dashboard/reader");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            request.setAttribute("msgError", "Xóa thất bại, người dùng không hợp lệ");
            showListReader(request, response);
        }
    }

    private void showInfoReader(HttpServletRequest request, HttpServletResponse response) {
        int idReader = Integer.parseInt(request.getParameter("id"));
        Reader reader = readerService.findById(idReader);
        request.setAttribute("reader", reader);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view_reader/detail.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showListReader(HttpServletRequest request, HttpServletResponse response) {
        List<Reader> listReader = readerService.listReadable();
        request.setAttribute("listReader", listReader);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view_reader/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
