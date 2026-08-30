class AsyncBuffer(private val state: Int = 37) {
    fun dispatch(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 37) % 997
        }
        return count
    }
}

fun main() {
    println(AsyncBuffer().dispatch(37))
}
