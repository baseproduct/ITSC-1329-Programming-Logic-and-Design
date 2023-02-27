fun main() {
    println("How many checks did we use this month?")
        val checks = Integer.valueOf(readln())

    if (checks <= 19)
        val total = (($checks * .1) +10)
        println("Total bank fees this month are $total.")
    if ((checks >= 20) and (checks <= 39))
            val total = ((checks *.08) +10)
            println("Total banks fees this month are $total.")
    if ((checks >= 40) and (checks <= 59))
        val total = ((checks *.06) +10)
        println("Total banks fees this month are $total.")
    if (checks >= 60)
        val total = ((checks * .04) +10)
        println("Total banks fees this month are $total.")
}