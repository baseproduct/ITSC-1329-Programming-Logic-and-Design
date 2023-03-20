fun main {
    var spop = null
    var horny = null
    var deltaT = null
    var counter = 0

    While (spop == null) {
        Println("Please enter a starting population size-- must be greater than 1!")
            var usrIn1 = readln()
        try {
            var spop = usrIn1?.toInt()
            if (spop != null && spop < 2) {
                print("Invalid entry. Please enter a number greater than or equal to 2:")
                var spop = null } } }

    While (horny == null) {
        Println("Please enter the average anticipated daily rate of reproduction as a percentage of population:")
                var usrIn2 = readln()
        try {
            var horny = usrIn2?.toInt()
            if (horny != null && horny <= 0) {
                print("Invalid entry. Please enter a number greater than zero:")
                var horny = null } } }

    While (deltaT == null) {
        Println("Please enter the time in days your sample will reproduce:")
            var usrIn3 = readln()
            try {
                var deltaT = usrIn3?.toInt()
                if (deltaT != null && deltaT < 1) {
                    print("You're gonna give them an all-expenses paid trip to Smashtown, then not let them board the train?")
                    print("Try again, mitosis-blocker. They deserve at least one glorious night of passion.")
                    var deltaT = null }
                else
                    print("Thank you!") } }

    var hornymultiplier: Int? ((horny/100)+1)
        
    var tpop1 = spop

    do {
        var tpop2 = (tpop1 * hornymultiplier)
        println(tpop2.toString().removeSuffix())
        var tpop1 = tpop2
        counter++
    }   while (counter != deltaT) 
    }


}