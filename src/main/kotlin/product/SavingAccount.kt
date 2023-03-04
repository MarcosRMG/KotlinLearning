package product

class SavingAccount(
    holder: String,
    numberAccount: Int,
    numberAgency: String) : Account(holder, numberAccount, numberAgency) {

        override fun toString(): String {
            return "Saving Account" + "\n" +
                    super.toString()
        }
}