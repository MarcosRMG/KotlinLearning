package model.product

import model.people.Client

class CurrentAccount(
    holder: Client,
    numberAccount: Int,
    numberAgency: String
) : Account(holder, numberAccount, numberAgency) {

    override fun toString(): String {
        return "Current Account" + "\n" +
                super.toString()
    }
}