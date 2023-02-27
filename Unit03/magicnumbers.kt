fun main() {
    print("Enter a month: ")
        val month = Integer.valueOf(readln())
    print("Enter a day: ")
        val day = Integer.valueOf(readLine())
    print("Enter a year: ")
        val year = Integer.valueOf(readLine())

    val moday = month * day

    when  {
        moday == year -> println("This is a magic date!")
        moday != year -> println("This is not a magic date.")
    }
}