import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(1000)
        println("Background task finished")
    }

    println("Main function running")
}
