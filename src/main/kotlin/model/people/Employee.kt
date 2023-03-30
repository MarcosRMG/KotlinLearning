package model.people

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
        return """
                    Name: ${this.name}
                    CPF: ${this.cpf} 
                    Role: ${this.role.name} 
                    Salary: $${this.salary} """.trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (other != null && other is Employee) {
            return this.cpf == other.cpf
        }
        return false
    }
}