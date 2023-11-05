package com.example.demo.controller;


import com.example.demo.model.CongViecDTO;
import com.example.demo.service.ICongViecService;
import com.example.demo.service.impl.CongViecServiceImpl;
import com.example.demo.service.impl.TrangThaiServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ABCServlet", value = "/cong-viec")
public class CongViecServlet extends HttpServlet {
    private CongViecServiceImpl congViecService = new CongViecServiceImpl();
    private TrangThaiServiceImpl trangThaiService = new TrangThaiServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "themMoi":
                danhSachThemMoi(request,response);
                break;
            default:
                hienThi(request,response);
        }
    }



    private void hienThi(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("dsCongViec",congViecService.hienthi());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("hien-thi.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void danhSachThemMoi(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("dsTrangThai",trangThaiService.hienThiTrangThai());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("them-moi.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "them":
                them(request,response);
                break;
            case "xoa":
                xoaCongViec(request,response);
                break;
            default:
                hienThi(request,response);
        }
    }


    private void them(HttpServletRequest request, HttpServletResponse response) {
        String tenCongViec =request.getParameter("tenCongViec");
        String ngayBatDau =request.getParameter("ngayBatDau");
        String ngayKetThuc =request.getParameter("ngayKetThuc");
        int maTrangThai =Integer.parseInt(request.getParameter("maTH"));
        String moTa =request.getParameter("moTa");
        CongViecDTO congViec = new CongViecDTO(tenCongViec,ngayBatDau,ngayKetThuc,moTa,maTrangThai);
        congViecService.themCongViec(congViec);
        hienThi(request,response);
    }

    private void xoaCongViec(HttpServletRequest request, HttpServletResponse response) {
        int maCongViec = Integer.parseInt(request.getParameter("maCongViec"));
        congViecService.xoaCongViec(maCongViec);
        hienThi(request,response);

    }
}
