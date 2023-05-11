fun main() {
    var usrin = null
    var answer = null
    var responses = arrayOf("Yes, of course!",
        "Without a doubt, yes.",
        "You can count on it.",
        "For sure!",
        "Ask me later.",
        "I’m not sure.",
        "I can’t tell you right now. I’ll tell you after my nap. No way!",
        "I don’t think so.",
        "Without a doubt, no.",
        "The answer is clearly NO.")
        themagic() }

fun themagic() {
    if (usrin == null)
        println("Ask your question of the might magic eight ball. It may grace you with an answer.")
        usrin = readln()
        answer = responses.random()
        println("$answer")
    while (answer == null)
}