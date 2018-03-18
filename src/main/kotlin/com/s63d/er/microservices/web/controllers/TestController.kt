package com.s63d.er.microservices.web.controllers

import com.s63d.er.microservices.web.clients.AccountClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(private val accountClient: AccountClient) {

    @GetMapping
    fun index() {
        accountClient.test()
    }
}