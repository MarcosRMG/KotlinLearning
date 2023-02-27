package people

abstract class Employee(
    private val name: String,
    private val cpf: String,
    private val salary: Double,
    private val role: Enum<Role>
) : Autenticate {

    fun getSalary(): Double {
        return this.salary
    }

    override fun login(): Boolean {
        return true
    }

    override fun toString(): String {
        return "Name: ${this.name}" + "\n" +
                "CPF: ${this.cpf}" + "\n" +
                "Role: ${this.role.name}" + "\n" +
                "Salary: $${this.salary}" + "\n"
    }
}