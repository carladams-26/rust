class LiteController(private val state: Int = 51) {
    fun build(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 51) % 997
        }
        return total
    }
}

fun main() {
    println(LiteController().build(51))
}
