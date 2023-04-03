fun main() {

    println("How many checks did we use this month?")
        val checks = Integer.valueOf(readln())
	var total = 0

    if (checks <= 19) {
        var total = ((checks * .1) +10)
        println("Total bank fees this month are $total.") 
				}
    if ((checks >= 20) and (checks <= 39)) {
            var total = ((checks *.08) +10)
            println("Total banks fees this month are $total.")
				}
    if ((checks >= 40) and (checks <= 59)) {
        var total = ((checks *.06) +10)
        println("Total banks fees this month are $total.") 
				}
    if (checks >= 60) {
        var total = ((checks * .04) +10)
        println("Total banks fees this month are $total.")
				}
}