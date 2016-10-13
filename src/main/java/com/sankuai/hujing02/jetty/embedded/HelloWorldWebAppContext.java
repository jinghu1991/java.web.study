package com.sankuai.hujing02.jetty.embedded;

import org.eclipse.jetty.jmx.MBeanContainer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AllowSymLinkAliasChecker;
import org.eclipse.jetty.webapp.WebAppContext;

import java.io.File;
import java.lang.management.ManagementFactory;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/12 下午5:53
 * Description:
 */

public class HelloWorldWebAppContext {

    public static void main( String[] args ) throws Exception
    {
        Server server = new Server(8080);

        // Setup JMX
        MBeanContainer mbContainer = new MBeanContainer(
                ManagementFactory.getPlatformMBeanServer());
        server.addBean(mbContainer);

        // The WebAppContext is the entity that controls the environment in
        // which a web application lives and breathes. In this example the
        // context path is being set to "/" so it is suitable for serving root
        // context requests and then we see it setting the location of the war.
        // A whole host of other configurations are available, ranging from
        // configuring to support annotation scanning in the webapp (through
        // PlusConfiguration) to choosing where the webapp will unpack itself.
        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        File warFile = new File("/Users/jinghu1991/workspace/java.web.study/target/java.web.study-release-1.0-SNAPSHOT.war");
        webapp.setWar(warFile.getAbsolutePath());
        webapp.addAliasCheck(new AllowSymLinkAliasChecker());
        server.setHandler(webapp);
        server.start();
        server.join();
    }
}
