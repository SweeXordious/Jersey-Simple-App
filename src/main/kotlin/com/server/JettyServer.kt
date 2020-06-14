package com.server

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.server.ServerConnector
import org.eclipse.jetty.servlet.ServletContextHandler
import org.eclipse.jetty.servlet.ServletHolder
import org.glassfish.jersey.servlet.ServletContainer

class JettyServer(
    private val serverHost: String = "localhost",
    private val serverPort: Int = 8080
) {

    fun start(){

        val contextHandler = ServletContextHandler(ServletContextHandler.NO_SESSIONS).apply {
            contextPath = "/"
            addServlet(ServletHolder(ServletContainer(ResourceConfig())), "/*")
        }

        Server().apply{
            handler = contextHandler
            addConnector(ServerConnector(this).apply {
                host = serverHost
                port = serverPort
            })
            start()
            join()
        }
    }
}