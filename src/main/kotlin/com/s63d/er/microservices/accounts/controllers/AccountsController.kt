package com.s63d.er.microservices.accounts.controllers

import com.s63d.er.microservices.accounts.exceptions.AccountNotFoundException
import com.s63d.er.microservices.accounts.models.Account
import com.s63d.er.microservices.accounts.repositories.AccountRepository
import org.springframework.web.bind.annotation.*

@RestController
class AccountsController(private val accountRepository: AccountRepository) {

    @GetMapping
    fun all() = accountRepository.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = accountRepository.findById(id).orElseThrow { AccountNotFoundException(id) }

    @PostMapping
    fun create(@RequestParam firstName: String, @RequestParam lastName: String) = accountRepository.save(Account(firstName, lastName))
}