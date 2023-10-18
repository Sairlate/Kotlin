class SugarStorage(val sugar : Int){
    var volume: Int = sugar
    fun decreaseSugar(v:Int){
        println("Текущее хранилище: $volume")
        if(v < 0){
            println("Вас проигнорили")
            return
        }
        else if (v > volume){
            throw IllegalArgumentException("Не пихай негатив")
        }
        else
            volume -= v
            println("Баланс хранилища: $volume")
    }

    fun increaseSugar(v:Int){
        println("Текущее хранилище: $volume")
        if(v < 0){
            println("Вас проигнорили")
            return
        }
        else
            volume += v
            println("Баланс хранилища: $volume")
    }
}