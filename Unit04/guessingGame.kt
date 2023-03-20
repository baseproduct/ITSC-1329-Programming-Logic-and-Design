fun main {
    var target = (Math.random() * 100).toInt()
        if (target = 0) {
            var target = 1 }
    Print("I have chosen a number between 1 and 100.")
    do {
        Println("What's your guess?")
        var usrguess = readln()
        var compnum = usrguess.toInt()
        when {
            compnum > target -> print("Too high!")
            compnum < target -> print("Too low!")
            compnum = target -> print("You guessed it!")
        }
    }   while (compnum != target)    
    }
    
}