package model.location

class Address(
    val city: String,
    val state: Enum<State>,
    val street: String,
    val number: Int
) {
    override fun toString(): String {
        return "City: ${this.city}" + "\n" +
                "State: ${this.state}" + "\n" +
                "Street: ${this.street}" + "\n" +
                "Number: ${this.number}"
    }
}