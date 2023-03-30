package model.people

import model.location.Address

class Client(
    private val name: String,
    private val age: Int,
    private val address: Address,
) {
    fun getName(): String {
        return this.name
    }
    override fun toString(): String {
        return "Name: ${this.name}" + "\n" +
                "Age: ${this.age}" + "\n" +
                "Address: ${this.address}"
    }
}