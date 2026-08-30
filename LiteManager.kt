class AtomicClient(private val state: Int = 76) {
    fun handle(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 76) % 997
        }
        return count
    }
}

fun main() {
    println(AtomicClient().handle(76))
}
