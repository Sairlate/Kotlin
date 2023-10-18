fun rawEngineStatus(engineNumber:Int):String{
    return "$engineNumber"
}
fun engineStatus(engineNumber:Int): String{
    return try {
        rawEngineStatus(engineNumber)
    }
    catch (e: EngineNotFoundException) {
        return "engine $engineNumber not found"
    }
    catch (e: SensorsMeltException) {
        return "engine $engineNumber offline"
    }
}
class EngineNotFoundException(message: String) : Exception(message)

class SensorsMeltException(message: String) : Exception(message)
