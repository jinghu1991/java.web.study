package com.sankuai.hujing02.jetty.embedded;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/12 下午5:43
 * Description:
 */

public class DumpServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<h1>DumpServlet</h1><pre>");
        response.getWriter().println("requestURI=" + request.getRequestURI());
        response.getWriter().println("contextPath=" + request.getContextPath());
        response.getWriter().println("servletPath=" + request.getServletPath());
        response.getWriter().println("pathInfo=" + request.getPathInfo());
        response.getWriter().println("session=" + request.getSession(true).getId());
        response.getWriter().println("</pre>");
    }
}
