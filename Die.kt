

enum class Color {
    RED,
    BROWN,
    ORANGE,
    PURPLE,
}

enum class Sides(val value: Int) {
    THREE(3),
    FOUR(4),
    SIX(6),
    TWENTY(20),
}

class Die(private val color: Color, private val numOfSides: Sides, private val sideUp: Int)

fun man() {
    val die = Die(Color.RED, Sides.TWENTY, 1)
    println(die)
}
