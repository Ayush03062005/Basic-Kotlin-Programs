data class User(
    val id: Int,
    val username: String,
    val isActive: Boolean
)

fun main() {
    val user1 = User(1, "Ayush", true)

    println(user1)
}
