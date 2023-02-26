class Account(
    val holder: String,
    val numberAccount: Int,
    val numberAgency: String) {

    private var balance = 0.0
        set(value) {
            if (value >= 0)
                field = value
        }

    private fun checkBalance(value: Double):  Boolean {
        if (this.balance >= value) {
            return true
        }
        return false
    }

    fun deposit(value: Double) {
        this.balance += value
    }

    fun withdraw(value: Double) {
        if (this.checkBalance(value)) {
            this.balance -= value
        }
    }

    fun transfer(account: Account, value: Double) {
        if (this.checkBalance(value)) {
            this.withdraw(value)
            account.deposit(value)
        }
    }

    override fun toString(): String {
        return "=====================" + "\n" +
                "Account: ${this.numberAccount}" + "\n" +
                "Agency: ${this.numberAgency}" + "\n" +
                "Holder: ${this.holder}" + "\n" +
                "Balance: ${this.balance}"
    }
}