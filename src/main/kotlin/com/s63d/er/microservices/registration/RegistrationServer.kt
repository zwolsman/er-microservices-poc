package com.s63d.er.microservices.registration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class RegistrationServer

fun main(args: Array<String>) {
    System.setProperty("spring.config.name", "registration-server")
    runApplication<RegistrationServer>(*args)
}