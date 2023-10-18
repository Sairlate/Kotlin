fun main(args: Array<String>) {
    println(calcChairs(3))
}
fun calcChairs(x: Int): Int {
    val z = x / 2
    return x + z
}