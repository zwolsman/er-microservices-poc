package com.s63d.er.microservices.web.controllers

import com.s63d.er.microservices.web.clients.AccountsClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(private val accountsClient: AccountsClient) {

    @GetMapping
    fun index() {
        accountsClient.test()
    }
}