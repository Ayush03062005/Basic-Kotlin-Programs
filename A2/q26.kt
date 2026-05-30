import kotlinx.coroutines.*

data class CartItem(
    val name: String,
    val price: Double,
    val quantity: Int
)

fun List<CartItem>.calculateTotal(): Double {
    return this.sumOf { it.price * it.quantity }
}

sealed class CheckoutResult

object Processing : CheckoutResult()

data class Success(val receiptId: String) : CheckoutResult()

data class Failed(val reason: String) : CheckoutResult()

object PaymentProcessor {

    suspend fun processPayment(
        cart: List<CartItem>
    ): CheckoutResult {

        delay(2000)

        val total = cart.calculateTotal()

        return if (total > 1000) {
            Failed("Insufficient funds for large transaction")
        } else {
            Success("TXN-${(1000..9999).random()}")
        }
    }
}

fun main() = runBlocking {

    val cheapCart = listOf(
        CartItem("Mouse", 25.0, 2),
        CartItem("Keyboard", 50.0, 1)
    )

    val expensiveCart = listOf(
        CartItem("Laptop", 1200.0, 1)
    )

    launch {
        val result = PaymentProcessor.processPayment(cheapCart)

        when (result) {
            is Success -> println("Cheap Cart Success: ${result.receiptId}")
            is Failed -> println("Cheap Cart Failed: ${result.reason}")
            is Processing -> println("Cheap Cart Processing")
        }
    }

    launch {
        val result = PaymentProcessor.processPayment(expensiveCart)

        when (result) {
            is Success -> println("Expensive Cart Success: ${result.receiptId}")
            is Failed -> println("Expensive Cart Failed: ${result.reason}")
            is Processing -> println("Expensive Cart Processing")
        }
    }
}
