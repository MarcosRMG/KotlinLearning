import people.Manager
import people.Specialist

fun main() {
    val worker = Manager("Silvia", "001.001.001-01", 2500.0)
    println(worker)

    println()
    val specialist = Specialist("Marcos", "002.002.002-02", 14000.0)
    println(specialist)
}