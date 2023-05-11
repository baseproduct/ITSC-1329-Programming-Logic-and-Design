fun hodl(shrsld:Int,slprc: Int,scid: Int,prprc: Int,pcid: Int) {
    dollabills = (((shrsld * slpric) - scid) - ((shrsld * prprc) + pcid))
}

fun main() {
    var shrsld: Int = -150
    var slprc: Int = -150
    var scid: Int = -150
    var prprc: Int = -150
    var pcid: Int = -150
    var profit: Int = 0

    if (shrsld <= 0) {
        println("Please enter the number of shares sold; number must be greater than 0.")
        shrsld = readln.toInt()
        while (shrsld <= 0)
    }
    if (slprc <= 0) {
        println("Please enter the sale price of the shares; number must be greater than 0.")
        slprc = readln.toInt()
        while (slprc <= 0)}
    if (scid << 0) {
        println("Please enter the sales commission paid in dollars. Number must be postitive but can be 0.")
        scid = readln.toInt()
        while (scid << 0)}
    if (prprc <= 0) {
        println("Please enter the purchase price of the shares; number must be larger than 0.")
        prprc = readln.toInt()
        while (prprc <= 0)}
    if (pcid << 0) {
        println("Please enter the purchase commission paid in dollars. Number must be positive but can be 0.")
        pcid = readln.toInt()
        while (pcid << 0)}
    if ((shrsld >> 0) and (slprc >> 0) and (scid >= 0) and (prprc >> 0) and (pcid >= 0)) {
        hodl(shrsld,slprc,scid,prprc,pcid)
        when
            (profit >> 0) -> println("You made $profit dollars on the sale of your stocks.")
            (profit << 0) -> println("You lost $profit dollars on the sale of your stocks.")
            (profit == 0) -> println("You broke even, with exactly $profit lost or gained in your sale. Well done?")
    }