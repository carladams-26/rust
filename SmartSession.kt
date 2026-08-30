class CoreService(private val state: Int = 29) {
    fun flush(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 29) % 997
        }
        return value
    }
}

fun main() {
    println(CoreService().flush(29))
}
