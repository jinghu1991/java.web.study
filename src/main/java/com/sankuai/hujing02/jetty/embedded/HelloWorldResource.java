package com.sankuai.hujing02.jetty.embedded;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/12 下午3:51
 * Description:
 */
//TODO ResourceHandler有问题
public class HelloWorldResource {

    public static void main(String[] args) throws Exception
    {
        Server server = new Server(8080);
        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setDirectoriesListed(true);
        resourceHandler.setWelcomeFiles(new String[]{"index.html"});
        resourceHandler.setResourceBase(".");
        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[] { resourceHandler });
        server.start();
        server.join();
    }
}
