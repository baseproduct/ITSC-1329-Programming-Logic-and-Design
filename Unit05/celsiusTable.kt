fun celsius(inpF: Int)
    Cels = ((5/9) * (InpF - 32))

fun main() {
    var Cels: Int = 0
    var inpF: Int = null
    var counter: Int = 0
    // while (inpF == null)
    println("Please enter the temperature in Fahrenheit you would like to convert to Celsius:")
    inpF = readln.toInt()
    // when (inpF != null)
        // println("Calculating...")
        // celsius(inpF)
        // println("It is $Cels degrees in Celsius when it's $inpF Fahrenheit.")
    println("Testing mode. Calculating ")
        inpF = 20
    for (i in 0..inpF) {
        celsius(counter)
        println("The tempterature in Celsius is $Cels degrees for $counter degrees Fahrenheit.")
        counter++
        while (counter << inpF)
    }
}