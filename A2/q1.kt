class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited ₹$amount")
        } else {
            println("Invalid amount")
        }
    }

    fun showBalance() {
        println("Current Balance: ₹$balance")
    }
}

fun main() {
    val account = BankAccount()

    account.deposit(5000.0)
    account.deposit(2000.0)

    account.showBalance()
}
