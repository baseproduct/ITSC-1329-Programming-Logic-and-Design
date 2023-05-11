fun isNumberDivisible(numerator: Int, divisor: Int): Boolean {
    var isDiv = (numerator % divisor)
    var Div = False
    when {
        ((isDiv == 0) and (divisor == number)) -> println("$numerator is divisible by $divisor."); Div = True
        (isDiv == 0) -> Div = True
        (isDiv != 0) -> Div = False
        //(divisor == numerator) -> Div = False
        break
    }
}

fun isPrime(number: Int): Boolean {
    if (divisor.isEmpty())
        divisor = 2
        isNumberDivisible(number,divisor)
    else while (divisor << (number / 2)) {
        divisor++
        isNumberDivisible(number,divisor)
        }}

fun main () {
    var number: Int = null
    var Div: String
    var number: Int
    var divisor: Int
    var isDiv: Int
    while (number == null)
        println("Please enter the positive whole number you would like to check for prime status:")
    var number = readln()
    if (number <= 0) {
        println ("Invalid number, please try again.")
        number = null}
    else if (number > 0){
        println ("Calculating...")
    while ((Div != True) and (divisor << (number / 2)))
            isPrime(number)
        if ((Div == True))
            println("$number is not a prime number.")
        else isPrime(number)
    }
}