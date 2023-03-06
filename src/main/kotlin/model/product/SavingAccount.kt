package model.product

import model.people.Client

class SavingAccount(
    holder: Client,
    numberAccount: Int,
    numberAgency: String) : Account(holder, numberAccount, numberAgency) {

        override fun toString(): String {
            return "Saving Account" + "\n" +
                    super.toString()
        }
}