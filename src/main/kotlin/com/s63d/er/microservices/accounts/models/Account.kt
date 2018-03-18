package com.s63d.er.microservices.accounts.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Account(@GeneratedValue @Id val id: Long?, val firstName: String, val lastName: String) {
    constructor(firstName: String, lastName: String) : this(null, firstName, lastName)
    constructor() : this(null, "", "") //TODO fix dit
}