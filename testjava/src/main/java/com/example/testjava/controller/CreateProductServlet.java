package com.example.testjava.controller;

import com.example.testjava.entity.Product;
import com.example.testjava.repository.JpaRepository;
import com.example.testjava.entity.Product;
import com.example.testjava.repository.JpaRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateProductServlet extends HttpServlet {

    private JpaRepository<Product> productJpaRepository = new JpaRepository<>(Product.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/admin/product/addphone.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setCharacterEncoding("UTF-8");
            String name = req.getParameter("name");
            double price = Double.parseDouble(req.getParameter("price"));
            String description = req.getParameter("description");
            Product product = new Product(name, price, description);
            System.out.println(product.isValid());
            System.out.println(product);
            if (product.isValid()){
                productJpaRepository.save(product);
                resp.sendRedirect("/admin/product/listphones");
            } else {
                // trả về chính cái form đó,
                // kèm theo thông tin lỗi.
                req.setAttribute("thongtinloi", "");
                req.getRequestDispatcher("/admin/product/addphone.jsp").forward(req, resp);
            }



        } catch (Exception ex){
            resp.getWriter().println("Bad request");
        }
    }
}
