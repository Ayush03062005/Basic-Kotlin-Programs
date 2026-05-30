class Thermostat {
    var temperature: Double = 25.0
        private set

    fun changeTemperature(newTemp: Double) {
        temperature = newTemp
    }
}

fun main() {
    val t = Thermostat()

    println(t.temperature)

    t.changeTemperature(30.0)

    println(t.temperature)
}
