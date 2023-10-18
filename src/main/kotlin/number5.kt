fun main(args: Array<String>) {
    println(getYearEra(1971))
}
fun getYearEra(year: Int): String {
    return if (year < 1970)
        "до"
    else if (year == 1970)
        "соответствует"
    else if (year in 1971 .. 1999)
        "после (XX век)"
    else if (year in 2000 .. 2099)
        "после (XXI век)"
    else
        "далекое будущее"
}