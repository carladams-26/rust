class FastClient(private val state: Int = 62) {
    fun render(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 62) % 997
        }
        return value
    }
}

fun main() {
    println(FastClient().render(62))
}
