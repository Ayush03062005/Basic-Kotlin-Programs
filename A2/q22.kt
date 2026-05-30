sealed class ScreenState

object Loading : ScreenState()

data class Success(val data: String) : ScreenState()

data class Error(val errorMsg: String) : ScreenState()

fun renderUI(state: ScreenState) {
    when (state) {
        is Loading -> println("Loading data...")
        is Success -> println("Data loaded: ${state.data}")
        is Error -> println("Error: ${state.errorMsg}")
    }
}

fun main() {
    renderUI(Loading)
    renderUI(Success("User profile loaded"))
    renderUI(Error("Network connection failed"))
}
