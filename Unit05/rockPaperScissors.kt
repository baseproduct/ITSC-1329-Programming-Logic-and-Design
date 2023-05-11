fun uChoose(usrinp: Array<String>) {
    var ofThree = false
    var urchoice = null
    while (ofThree == false) {
        println("PLease choose one of the following:")
        for ((index, item) in usrinp) {
            println("{$index + 1} . $item")}
        var chosen = readln.toString()
        if (chosen in usrinp) {
            ofThree = true
            urchoice = chosen
            else println("Invalid choice, please choose from the provided choices")

        }}}


fun whowon(oppchoice: string, urchoice: String) {
    println("You chose $urchoice.")
    println("I chose $oppChoice.")
    when
        (urchoice == oppchoice) -> println("We draw. You are a worthy opponent.")
        ((urchoice == Rock) and (oppchoice == Scissors)) -> println("Rock crushes scissors. You win!")
        ((urchoice == Scissors) and (oppchoice == Rock)) -> println("Rock crushes scissors. I win!")
        ((urchoice == Rock) and (oppchoice == Paper)) -> println("Paper wraps rock. I win!")
        ((urchoice == Paper) and (oppchoice == Rock)) -> println("Paper wraps rock. You win!")
        ((urchoice == Scissors) and (oppchoice == Paper)) -> println("Scissors cut paper. You win!")
        ((urchoice == Paper) and (oppchoice == Scissors)) -> println("Scissors cut paper. I win!")


}

fun main() {
    val theThree = arrayOf("Rock", "Paper", "Scissors")
    var oppinp = choices.random()
    var usrinp = uChoose(choices)
    whowon(oppinp,usrinp)
}