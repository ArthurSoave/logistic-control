package com.soave.logisticcontrol

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "tb_client")
class ClientEntity(

    @Id
    @Column(name = "client_id")
    val id: Long,

    @Column(name = "client_full_name")
    val fullName: String

    @Column(name = "address_id")
    val address: Address,

    @Column(name = "contatc_id")
    val contact: Contact
)
