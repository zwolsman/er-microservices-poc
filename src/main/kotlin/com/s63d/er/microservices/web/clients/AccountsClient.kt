package com.s63d.er.microservices.web.clients

import com.s63d.er.microservices.accounts.models.Account
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class AccountsClient(private val restTemplate: RestTemplate) {
    companion object {
        val logger = LoggerFactory.getLogger(this::class.java)!!
    }

    @Value("\${services.accounts}")
    lateinit var BASE_URL: String

    private val logger = LoggerFactory.getLogger(this::class.java)!!

    fun all(): Array<Account> {
        logger.info("Getting all the accounts")
        return restTemplate.getForObject(BASE_URL, Array<Account>::class.java)!!
    }

    fun findById(id: Long): Account {
        logger.info("Getting account $id")
        return restTemplate.getForObject("$BASE_URL/$id", Account::class.java)!!
    }
}