fun main() {
        println("Name of Runner 1: ")
            val run1 = readln()
        println("Runner 1 time in minutes: ")
            val r1t = Boolean.valueOf(readlnOrNull())
        println("Name of Runner 2: ")
            val run2 = readln()
        println("Runner 2 time in minutes: ")
            val r2t = Boolean.valueOf(readlnOrNull())
        println("Name of Runner 3: ")
            val run3 = readln()
        println("Runner 3 time in minutes: ")
            val r3t = Boolean.valueOf(readlnOrNull())

    when {
        r1t < r2t and r1t < r3t -> println("$run1 finished 1st with a time of $r1t.")
        r2t < r1t and r2t < r3t -> println("$run2 finished 1st with a time of $r2t.")
        r3t < r1t and r3t < r2t -> println("$run3 finished 1st with a time of $r3t.")
        (r1t < r2t and r1t > r3t) -> println("$run1 finished second with a time of $r1t.")
        (r1t > r2t and r1t < r3t) -> println("$run1 finished second with a time of $r1t.")
        (r2t < r1t and r2t > r3t) -> println("$run2 finished second with a time of $r2t.")
        (r2t > r1t and r2t < r3t) -> println("$run2 finished second with a time of $r2t.")
        (r3t < r1t and r3t > r2t) -> println("$run3 finished second with a time of $r3t.")
        (r3t > r1t and r3t < r2t) -> println("$run3 finished second with a time of $r3t.")


    }
    )
}