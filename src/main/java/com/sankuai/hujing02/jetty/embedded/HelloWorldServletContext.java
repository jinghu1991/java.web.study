package com.sankuai.hujing02.jetty.embedded;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/12 下午5:24
 * Description:
 */

public class HelloWorldServletContext {
    public static void main( String[] args ) throws Exception
    {
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(
                ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        context.setResourceBase(System.getProperty("java.io.tmpdir"));
        System.out.println(System.getProperty("java.io.tmpdir"));
        server.setHandler(context);
        context.addServlet(DefaultServlet.class, "/");
        context.addServlet(HelloWorldServlets.class, "/hello");
        context.addServlet(DumpServlet.class, "/dump/*");
        server.start();
        server.join();
    }
}
