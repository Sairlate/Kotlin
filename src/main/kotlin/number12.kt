fun main(args: Array<String>) {
    println(getCubeList(10))
}
fun getCubeList(n: Int){
    val numbers : ArrayList<Int> = arrayListOf()
    for (i in 0 until n)
        numbers.add(i.times(i).times(i))
    for(number in numbers) println(number)
}