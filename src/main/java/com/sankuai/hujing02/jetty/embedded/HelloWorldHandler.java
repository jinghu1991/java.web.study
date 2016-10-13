package com.sankuai.hujing02.jetty.embedded;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/11 下午3:54
 * Description:
 */

public class HelloWorldHandler extends AbstractHandler
{
    @Override
    public void handle( String target,
                        Request baseRequest,
                        HttpServletRequest request,
                        HttpServletResponse response ) throws IOException,
            ServletException
    {
        // Declare response encoding and types
        response.setContentType("text/html; charset=utf-8");

        // Declare response status code
        response.setStatus(HttpServletResponse.SC_OK);

        // Write back response
        response.getWriter().println("<h1>Hello World</h1>");

        // Inform jetty that this request has now been handled
        baseRequest.setHandled(true);
    }

    public static void main( String[] args ) throws Exception
    {
        Server server = new Server(8080);
//        等价于
//        ServerConnector connector = new ServerConnector(server);
//        connector.setHost("localhost");
//        connector.setPort(8080);
//        server.addConnector(connector);
        server.setHandler(new HelloWorldHandler());
        server.start();
        server.join();
    }
}