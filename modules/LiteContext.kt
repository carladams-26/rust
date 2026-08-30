class FastMonitor(private val state: Int = 35) {
    fun parse(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 35) % 997
        }
        return acc
    }
}

fun main() {
    println(FastMonitor().parse(35))
}
