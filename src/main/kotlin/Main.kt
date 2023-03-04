import people.Manager
import people.Specialist
import product.CurrentAccount
import product.SavingAccount

fun main() {
    val worker = Manager("Silvia", "001.001.001-01", 2500.0)
    println(worker)

    println()
    val specialist = Specialist("Marcos", "002.002.002-02", 14000.0)
    println(specialist)
    println()

    val marcosCa = CurrentAccount("Marcos", 100, "001")
    val marcosSa = SavingAccount("Marcos", 102, "001")

    marcosCa.deposit(100.0)
    marcosCa.transfer(marcosSa, 50.0)

    println(marcosCa)
    println()
    println(marcosSa)
}