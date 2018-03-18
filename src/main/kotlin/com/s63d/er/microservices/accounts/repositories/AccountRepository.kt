package com.s63d.er.microservices.accounts.repositories

import com.s63d.er.microservices.accounts.models.Account
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository : CrudRepository<Account, Long>