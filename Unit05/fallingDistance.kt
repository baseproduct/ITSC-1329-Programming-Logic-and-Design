fun fallingdistance(deltaT: Int) {
    tvar = (deltaT * deltaT)
    dist = (.5 * (9.8 * tvar))
}

fun main () {
    var tvar: Int = 0
    var dist: Int = 0
    var deltaT = 0
    println("Please enter the time spent falling in seconds (must be greater than 0:")
    var deltaT = readln
    if (deltaT == 0) {
        println("It didn't fall. What kind of operation do you think I'm running here?") }
    if (deltaT >= 0)
        fallingdistance(deltaT)
        println("The object fell $dist meters.")
    if (deltaT == test)
        deltaT = 1
        fallingdistance(deltaT)
        println("The object fell $dist meters after $deltaT seconds.")
        deltaT++
        while (deltaT <= 10)

}