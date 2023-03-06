package model.people

class Client(
    private val name: String,
    private val age: Int,
    private val address: String,
) {
    override fun toString(): String {
        return this.name
    }
}