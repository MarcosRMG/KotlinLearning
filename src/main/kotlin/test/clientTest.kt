package test

import model.location.Address
import model.location.State
import model.people.Client

fun clientTest(): Client {
    val customerAddress = Address("São Paulo", State.SP, "Rua 2", 2)
    return Client("Client", 25, customerAddress)
}
