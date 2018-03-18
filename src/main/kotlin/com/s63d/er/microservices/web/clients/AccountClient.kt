package com.s63d.er.microservices.web.clients

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class AccountsClient {
    companion object {
        val logger = LoggerFactory.getLogger(this::class.java)!!
    }
    @Value("\${services.accounts}")
    lateinit var BASE_URL: String


    fun test() {
        logger.info("The base url for the account client is: $BASE_URL")
    }
}