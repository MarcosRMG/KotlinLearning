package product

class CurrentAccount(
    holder: String,
    numberAccount: Int,
    numberAgency: String
) : Account(holder, numberAccount, numberAgency) {

    override fun toString(): String {
        return "Current Account" + "\n" +
                super.toString()
    }
}