fun main() {
    println("Enter your weight: ")
        val weight = Integer.valueOf(readLine())
    println("Enter your height: ")
        val height = Integer.valueOf(readLine())

    val bmi = (weight * 703 / (height * height))

    when {
        bmi <= 18.5 -> println("Underweight")
        bmi > 25 -> println("Overweight")
        else -> println("Normal weight")
    }
}