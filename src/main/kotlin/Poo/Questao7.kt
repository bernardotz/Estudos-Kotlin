package Poo

class Bank(private val accounts: MutableList<Account> = mutableListOf()) {


    fun addAccount(account: Account) {
        accounts.add(account)
    }

    fun removeAccount(account: Account) {
        accounts.remove(account)
    }

    fun listAccounts() {
        accounts.forEach {
            println(it)
        }
    }
}

data class Account(val number: Long, val clientName: String = " Roberto")

fun main() {
    val inter = Bank()
    val a1 = Account(123456)
    val a2 = Account(654321)
    val a3 = Account(909027)
    inter.addAccount(a1)
    inter.addAccount(a2)
    inter.addAccount(a3)
    inter.listAccounts()
    inter.removeAccount(a2)
    inter.listAccounts()

}