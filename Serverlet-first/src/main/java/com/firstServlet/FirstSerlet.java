package com.firstServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @program: Serverlet-first
 * @description
 * @author: hu
 * @create: 2022-06-21 23:31
 **/
public class FirstSerlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        String html = "<h1 style='color:red'>"+name+"<h1/>";
        res.getWriter().println(html);
    }
}
