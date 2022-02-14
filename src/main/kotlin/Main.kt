sealed class Data {
    data class Success(val amount: Int) : Data()
    data class Error(val amount: Int) : Data()
}

fun getData(value: Int): Data {
    if(value > 100) {
        return Data.Success(value)
    } else {
        return Data.Error(value)
    }
}

fun main(args: Array<String>) {
    val d = getData(99)
    when (d) {
        is Data.Success -> {
            println("Success, Result: $d")
        }
        is Data.Error -> {
            println("Error, Result: $d")
        }
    }
}