fun main() {
	val cookiecal = 75
	println("How many cookies did you eat? ")
		val usr = readLine()?.toInt()?:0
	val usrcal = usr * cookiecal
	println("You consumed $usrcal calories in cookies.") 
}