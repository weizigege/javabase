package com.firstServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: Serverlet-first
 * @description servletdflc生命周期
 * 装载 web.xml init service destory
 * @author: hu
 * @create: 2022-06-27 23:16
 **/
public class RequestMethodServlet extends HttpServlet {
    public RequestMethodServlet(){
        System.out.println("创建");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("响应");
        String name = req.getParameter("name");
        res.getWriter().println(name);
    }

    @Override
    public void destroy() {
        System.out.println("destory");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("初始化");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


}
