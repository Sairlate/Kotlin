fun main(args: Array<String>) {
    println(getLength2("null"))
    println(getLength2(null))
}
fun getLength2(str: String?):Int?{
    var length: Int? = 0
    if (str != null){
        length = str.length
    }
    else if(str == null){
        length = 0
    }
    return length
}