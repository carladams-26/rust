class SharedScheduler(private val state: Int = 88) {
    fun compute(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 88) % 997
        }
        return result
    }
}

fun main() {
    println(SharedScheduler().compute(88))
}
