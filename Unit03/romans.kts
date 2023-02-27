fun main() {
    println("Enter a number between 1 and 10.")
    val roman = readln()!!

    when (roman){
        "1" -> println("The Roman Numeral for that is I")
        "2" -> println("The Roman Numeral for that is II")
        "3" -> println("The Roman Numeral for that is III")
        "4" -> println("The Roman Numeral for that is IV")
        "5" -> println("The Roman Numeral for that is V")
        "6" -> println("The Roman Numeral for that is VI")
        "7" -> println("The Roman Numeral for that is VII")
        "8" -> println("The Roman Numeral for that is VIII")
        "9" -> println("The Roman Numeral for that is IX")
        "10" -> println("The Roman Numeral for that is X")
        else -> println("That number is outside the bounds of this program.")
    }