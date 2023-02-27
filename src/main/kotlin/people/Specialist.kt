package people

class Specialist(
    name: String,
    cpf: String,
    salary: Double,
    role: Enum<Role> = Role.SPECIALIST
) : Employee(name, cpf, salary, role) {

    companion object {
        const val BONUS_PERCENTAGE = 0.12
    }

    private val bonus: Double
        get() {
        return super.getSalary() * BONUS_PERCENTAGE
    }

    override fun toString(): String {
        return super.toString() +
                "Bonus: $${bonus}"
    }
}