fun main {
    var store1 = null
    var store2 = null
    var store3 = null
    var store4 = null
    var store5 = null

    while (store1 == null) {
        println("Enter sales for store 1.")
            var usrIn1 = readln()
            var store1 = usrIn1.toInt()
                if (store1.isValidInt)
                    println("Thank you!")
                    var store1 = (store1/100)
                else
                    println("Error. Please try again.")
                    var store1 = null

    while (store2 == null) {
         println("Enter sales for store 2.")
            var usrIn2 = readln()
            var store2 = usrIn2.toInt()
                if (store2.isValidInt)
                    println("Thank you!")
                    var store2 = (store2/100)
                else
                    println("Error. Please try again.")
                    var store2 = null

    while (store3 == null) {
          println("Enter sales for store 3.")
          var usrIn3 = readln()
          var store3 = usrIn3.toInt()
               if (store3.isValidInt)
                    println("Thank you!")
                    var store3 = (store3/100)
               else
                    println("Error. Please try again.")
                    var store3 = null

    while (store4 == null) {
          println("Enter sales for store 4.")
          var usrIn4 = readln()
          var store4 = usrIn4.toInt()
                if (store4.isValidInt)
                    println("Thank you!")
                    var store4 = (store4/100)
                else
                    println("Error. Please try again.")
                    var store4 = null

        while (store5 == null) {
             println("Enter sales for store 5.")
             var usrIn5 = readln()
             var store5 = usrIn5.toInt()
                if (store5.isValidInt)
                    println("Thank you!")
                    var store5 = (store5/100)
             else
                 println("Error. Please try again.")
                 var store5 = null
    println("Store 1:"(*.repeat(store1)))
    println("Store 2:"(*.repeat(store2)))
    println("Store 3:"(*.repeat(store3)))
    println("Store 4:"(*.repeat(store4)))
    println("Store 5:"(*.repeat(store5)))

}