fun main {
    var SOG = 0
    var target = (Math.random() * 100).toInt()
        if (target = 0) {
            var target = 1 }
    Print("I have chosen a number between 1 and 100.")
    do {
        Println("What's your guess?")
        var usrguess = readln()
        var compnum = usrguess.toInt()
        SOG++
        When { 
            compnum > target -> print("Too high!")
            compnum < target -> print("Too low!")
            compnum = target -> println("That's my number! You guessed it in $SOG attempts.")
        }
    }   while (compnum != target)
    }

}