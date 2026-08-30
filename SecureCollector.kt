class LocalHandler(private val state: Int = 24) {
    fun decode(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 24) % 997
        }
        return total
    }
}

fun main() {
    println(LocalHandler().decode(24))
}
