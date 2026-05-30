abstract class Shape {
    abstract fun calculateArea(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun calculateArea(): Double {
        return 3.14 * radius * radius
    }
}

class Square(val side: Double) : Shape() {
    override fun calculateArea(): Double {
        return side * side
    }
}

fun processShapes(
    shapes: List<Shape>,
    action: (Double) -> Unit
) {
    for (shape in shapes) {
        val area = shape.calculateArea()
        action(area)
    }
}

fun main() {
    val shapes = listOf(
        Circle(5.0),
        Square(4.0)
    )

    processShapes(shapes) {
        println("Area: $it")
    }
}
