package com.s63d.er.microservices.web.controllers

import com.s63d.er.microservices.web.clients.AccountsClient
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class AccountsController(private val accountsClient: AccountsClient) {

    @GetMapping
    fun index(model: Model): String {
        model["message"] = "this is my message"
        model["accounts"] = accountsClient.all()
        return "index"
    }

    @GetMapping("/{id}")
    fun idAccount(@PathVariable id: Long, model: Model): String {
        model["account"] = accountsClient.findById(id)
        return "account"
    }
}