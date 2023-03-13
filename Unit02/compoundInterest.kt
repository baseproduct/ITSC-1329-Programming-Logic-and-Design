fun main() {
	println("Please enter the starting principal. ")
		val prin = readln()

	println("Please enter the interest rate. ")
		val rate = readln()

	println("Please enter the number of times dividends are paid out per year in months. For example, if interest is compounded quarterly, enter 4. If interest is compounded monthly, enter 12. ")

		val div = readln()
	println("Please enter the number of years the principal will be left to compounnd in years. ")
		val time = readln()

val comint = ($prin * (1 + (($rate / div) * $div * $time))
	println("You should have $comint in your account after $time years.")