fun main() {
    println("Please enter the mass of the object in kilograms")
        val mass = Integer.valueOf(readLine())

    val weight = mass * 9.8

    if (weight < 10)
        println("That object is too small.")
    else if (weight > 1000)
        println("That object is too large.")
    else println("The weight of the object is $weight Newtons.")
}