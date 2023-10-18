fun main(args: Array<String>) {
    println(sahar(3,2,3))
}
fun sahar(cashAmount: Int, dayNumber: Int, bugRank: Int): Int {
    return cashAmount * (dayNumber * bugRank) + 42
}