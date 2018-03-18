package com.s63d.er.microservices.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class WebServer {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            System.setProperty("spring.config.name", "web-server")
            runApplication<WebServer>(*args)
        }
    }

}