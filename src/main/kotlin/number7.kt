fun main(args: Array<String>) {
    val list = "dsngoubougBUGjinBUGBUGjiojreg"
    println(calculateBugMentions(list, "BUG"))
}
fun calculateBugMentions(string: String, pattern: String): Int {
    return string.split(pattern)
        .dropLastWhile { it.isEmpty() }
        .toTypedArray().size - 1
}
