fun calculateRetail(whlsale: Int,markup: Int): Double {
    price = whlsale * markup
}

fun main () {
    var whlsale: Int = 0
    var markup: Int = (-1)
    var adjmrk: Int = 0
    var price: Int = 0
    if (whlsale <= 0)
        println("Please input the price (must be greater than 0):")
        whlsale = readln()
    while (whlsale <= 0)
    if (markup <= 0) {
        println("Please input the markup over wholesale as a percentage (for no markup, please enter 0):")
        markup = readln()
    while (markup <= 0) }
    if (markup == 0){
        adjmrk = 1
        calculateRetail(whlsale,adjmrk)
        println("The final price is $price.") }
    else {
            adjmrk = ((markup / 100) + 1)
            calculateRetail(whlsale,adjmark)
            println("The final price is $price.")
        }
}
