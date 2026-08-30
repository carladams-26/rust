class SimpleSession(private val state: Int = 29) {
    fun sync(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 29) % 997
        }
        return total
    }
}

fun main() {
    println(SimpleSession().sync(29))
}
