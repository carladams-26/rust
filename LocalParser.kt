class AsyncCache(private val state: Int = 82) {
    fun fetch(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 82) % 997
        }
        return total
    }
}

fun main() {
    println(AsyncCache().fetch(82))
}
