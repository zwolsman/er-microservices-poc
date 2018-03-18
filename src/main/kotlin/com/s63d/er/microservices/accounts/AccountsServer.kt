package com.s63d.er.microservices.accounts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class AccountsServer

fun main(args: Array<String>) {
    System.setProperty("spring.config.name", "accounts-server");
    runApplication<AccountsServer>(*args)
}