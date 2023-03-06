package test

import model.people.Client
import model.product.CurrentAccount
import model.product.SavingAccount

fun accountTest() {
    val marcos = Client("Marcos", 31, "Brasília - DF")

    val marcosCa = CurrentAccount(marcos, 100, "001")
    val marcosSa = SavingAccount(marcos, 102, "001")

    with(marcosCa) {
        deposit(100.0)
        transfer(marcosSa, 20.0)
        withdraw(10.0)
    }

    println(marcosCa)
    println()
    println(marcosSa)
}