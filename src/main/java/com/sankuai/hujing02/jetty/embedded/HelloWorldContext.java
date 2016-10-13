package com.sankuai.hujing02.jetty.embedded;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/12 下午5:19
 * Description:
 */

public class HelloWorldContext {

    public static void main( String[] args ) throws Exception
    {
        Server server = new Server( 8080 );
        ContextHandler context = new ContextHandler();
        context.setContextPath( "/hello" );
        context.setHandler( new HelloWorldHandler() );
        server.setHandler( context );
        server.start();
        server.join();
    }
}
