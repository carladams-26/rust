class SimpleRegistry(private val state: Int = 62) {
    fun render(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 62) % 997
        }
        return total
    }
}

fun main() {
    println(SimpleRegistry().render(62))
}
