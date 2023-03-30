package test

import model.product.CurrentAccount
import model.product.SavingAccount

fun accountTest() {
    val customer = clientTest()
    val marcosCa = CurrentAccount(customer, 100, "001")
    val marcosSa = SavingAccount(customer, 102, "001")

    with(marcosCa) {
        deposit(100.0)
        transfer(marcosSa, 20.0)
        withdraw(10.0)
    }

    println(marcosCa)
    println()
    println(marcosSa)
}