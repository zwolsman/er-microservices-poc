package com.s63d.er.microservices.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

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


    @Bean
    @LoadBalanced
    fun restTemplate() = RestTemplate()

}