import kotlinx.coroutines.*

suspend fun fetchUserData(): String {
    delay(1000)
    return "Alice"
}

suspend fun fetchAppConfig(): String {
    delay(2000)
    return "Dark Mode"
}

fun main() = runBlocking {
    val userDeferred = async {
        fetchUserData()
    }

    val configDeferred = async {
        fetchAppConfig()
    }

    val user = userDeferred.await()
    val config = configDeferred.await()

    println("User: $user")
    println("Config: $config")
}
