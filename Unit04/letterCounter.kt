fun main {
	var str1 = null
	var str2 = null
    println("Please enter a letter:")
        var usrIn1 = readln()
	var str1 = usrIn1?.ToString() 
	if (str1.isEmpty()) {
		println("Invalid entry. Please enter a letter."
		var str1 = null
	else println("Thank you!") }
    println("Please enter a word:")
        var usrIn2 = readln()
        var str2 = usrIn2?.ToString()
	if (str2.isEmpty()) {
		println("Invalid entry. Please enter a word."
		var str2 = null }
	else {
		println("Thank you!") }

    val total = str2.contains(str1)

    println("The letter $str1 occurs $total times in the word $str2.")
}