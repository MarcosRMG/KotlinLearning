fun main() {
    println("New Account")
    val marcos = Account("Marcos", 100, "001")
    println(marcos.toString())

    println("New Account")
    val luiza = Account("Luiza", 101, "001")
    println(luiza.toString())

    marcos.deposit(100.0)
    marcos.transfer(luiza, 50.0)

    println(marcos.toString())
    println(luiza.toString())
}