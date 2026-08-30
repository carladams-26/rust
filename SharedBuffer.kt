class StreamLoader(private val state: Int = 50) {
    fun build(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 50) % 997
        }
        return acc
    }
}

fun main() {
    println(StreamLoader().build(50))
}
