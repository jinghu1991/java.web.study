package com.sankuai.hujing02.jetty.embedded;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/12 下午3:29
 * Description:
 */

public class HelloWorldServlets extends HttpServlet {

    @Override
    protected void doGet( HttpServletRequest request,
                          HttpServletResponse response ) throws ServletException,
            IOException
    {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<h1>Hello from HelloServlet</h1>");
    }

    public static void main( String[] args ) throws Exception
    {
        Server server = new Server(8080);
        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);
        handler.addServletWithMapping(HelloWorldServlets.class, "/*");
        handler.addServletWithMapping(DumpServlet.class, "/dump/*");
        server.start();
        server.join();
    }
}
