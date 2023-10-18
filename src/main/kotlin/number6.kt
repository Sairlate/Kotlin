fun main(args: Array<String>) {
    val number = "212334412"
    println(calculateEvenDigits(number))
}
fun calculateEvenDigits(number: String): Int {
    var sum = 0
    for(char in number.toCharArray()) {
        if (char.digitToInt() % 2 == 0)
            sum += char.digitToInt()
    }
    return sum
}