package com.s63d.er.microservices.accounts

import com.s63d.er.microservices.accounts.models.Account
import com.s63d.er.microservices.accounts.repositories.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class AccountsServer : CommandLineRunner {

    @Autowired
    lateinit var repo: AccountRepository

    override fun run(vararg args: String?) {
        val accounts = listOf(
                Account("Marvin", "Zwolsman"),
                Account("Goos", "van den Bekerom"),
                Account("Regina", "Zwolsman"),
                Account("Corine", "Peels"),
                Account("Maud", "Ligtenberg")
        )

        for (account in accounts)
            repo.save(account)


        accounts.forEach(::println)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            System.setProperty("spring.config.name", "accounts-server");
            runApplication<AccountsServer>(*args)
        }
    }
}