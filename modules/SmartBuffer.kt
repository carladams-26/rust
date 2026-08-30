class FastProvider(private val state: Int = 42) {
    fun compute(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 42) % 997
        }
        return value
    }
}

fun main() {
    println(FastProvider().compute(42))
}
