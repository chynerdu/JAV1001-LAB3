
package game

fun main() {
    var default = Die()
    var die = Die(Sides.TWENTY)
    var index = 1
    while (default.sideUp != die.sideUp) {
        println("Rolling the d6")
        default = Die()
        println("The new value is ${default.sideUp}")
        println("Rolling the d20")
        println("The current sideup for d20 is ${die.sideUp}")
        die = Die(Sides.TWENTY)
        println("The new value is ${die.sideUp}")
        index++
        print("It took $index rolls")
    }
}
