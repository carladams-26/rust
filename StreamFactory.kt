class AtomicCollector(private val state: Int = 53) {
    fun run(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 53) % 997
        }
        return total
    }
}

fun main() {
    println(AtomicCollector().run(53))
}
