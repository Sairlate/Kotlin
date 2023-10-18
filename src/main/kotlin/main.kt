fun main(args: Array<String>) {
    val vasya = SimpleClass()
    println(vasya.simpleAge)
    println(vasya.simpleName)

    val gena = NibirunianClass()
    gena.createNamePlate("vasya")

    val sug = SugarStorage(10)
    sug.increaseSugar(9)
    sug.increaseSugar(-1)
    sug.decreaseSugar(9)
    sug.decreaseSugar(11)

    val bug = BugCivilian(3, "вася")
    println(bug.getSugarLimit())
}