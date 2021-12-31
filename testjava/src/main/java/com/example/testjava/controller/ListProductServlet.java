package com.example.testjava.controller;

import com.example.testjava.entity.Product;
import com.example.testjava.repository.JpaRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListProductServlet extends HttpServlet {

    JpaRepository<Product> productJpaRepository = new JpaRepository<>(Product.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> list = productJpaRepository.findAll();
        req.setAttribute("listphones", list);
        req.getRequestDispatcher("/admin/product/listphones.jsp").forward(req, resp);
    }
}
