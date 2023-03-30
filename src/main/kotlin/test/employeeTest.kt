package test

import model.people.Manager
import model.people.Specialist

fun employeeTest() {
    val manager = Manager("Boss", "012.012.012-12", 10000.0)
    println(manager)

    val specialist = Specialist("Expert", "012.012.012-12", 8000.0)
    println()
    println(manager.equals(specialist))
}