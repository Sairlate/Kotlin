fun main(args: Array<String>) {
    println(getLength("null"))
    println(getLength(null))
}
fun getLength(str: String?):Int?{
    var length: Int? = 0
    if (str != null){
        length = str.length
    }
    else if(str == null){
        length = null
    }
    return length
}