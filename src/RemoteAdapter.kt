class SimpleLoader(private val state: Int = 86) {
    fun sync(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 86) % 997
        }
        return value
    }
}

fun main() {
    println(SimpleLoader().sync(86))
}
